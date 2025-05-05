package adoptme.view;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionListener;

import adoptme.model.Cat;
import adoptme.model.Dog;
import adoptme.model.ExoticPet;
import adoptme.model.Pet;
import adoptme.model.Rabbit;
import adoptme.model.Shelter;
import adoptme.model.SortByAge;
import adoptme.model.SortBySpecies;

import javax.swing.JTextPane;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JTextField;

public class AdoptMeView extends JFrame{

	private JPanel jPanel;
	private JComboBox<Object> sortByComboBox;
	private JList<?> list;
	private JFrame inputFrame;
	private SortByAge ageSort = new SortByAge();
	private SortBySpecies speciesSort = new SortBySpecies();
	private final String nameSort = "Name";
	private JButton rmvBtn;
	private JTextField nameField;
	private JTextField ageField;
	private JComboBox<Object> selectPetType;
	private JButton btnAddPet;
	private JButton adoptBtn;
	private JTable table;
	
	public AdoptMeView(Shelter<?> s) {
		inputFrame = new JFrame();
		inputFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		inputFrame.setSize(1000,600);
		jPanel = new JPanel();
		jPanel.setBorder(new EmptyBorder(5,5,5,5));
		inputFrame.getContentPane().add(jPanel);
		jPanel.setLayout(null);
		
		list = new JList<>(s.getList());
		list.setBounds(254, 82, 720, 227);
		jPanel.add(list);
		
		table = new JTable();
		table.setBounds(0, 0, 1, 1);
		jPanel.add(table);
		sortByComboBox = new JComboBox<Object>();
		sortByComboBox.addItem(ageSort);
		sortByComboBox.addItem(speciesSort);
		sortByComboBox.addItem(nameSort);
		sortByComboBox.setBounds(750, 50, 121, 21);
		jPanel.add(sortByComboBox);
		
		JTextPane txtpnSortBy = new JTextPane();
		txtpnSortBy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnSortBy.setText("Sort By:");
		txtpnSortBy.setBounds(668, 50, 72, 26);
		jPanel.add(txtpnSortBy);
		
		rmvBtn = new JButton("Remove");
		rmvBtn.setBounds(157, 286, 89, 23);
		jPanel.add(rmvBtn);
		
		nameField = new JTextField();
		nameField.setBounds(70, 80, 107, 21);
		jPanel.add(nameField);
		nameField.setColumns(10);
		
		ageField = new JTextField();
		ageField.setBounds(70, 112, 86, 20);
		jPanel.add(ageField);
		ageField.setColumns(10);
		
		selectPetType = new JComboBox<Object>();
		selectPetType.setBounds(70, 143, 60, 22);
		selectPetType.addItem(new Cat());
		selectPetType.addItem(new Dog());
		selectPetType.addItem(new Rabbit());
		selectPetType.addItem(new ExoticPet());
		
		jPanel.add(selectPetType);
		
		
		JTextPane txtpnName = new JTextPane();
		txtpnName.setEditable(false);
		txtpnName.setText("Name:");
		txtpnName.setBounds(23, 82, 37, 20);
		jPanel.add(txtpnName);
		
		JTextPane txtpnAge = new JTextPane();
		txtpnAge.setEditable(false);
		txtpnAge.setText("Age:");
		txtpnAge.setBounds(23, 112, 37, 20);
		jPanel.add(txtpnAge);
		
		JTextPane txtpnSpecies = new JTextPane();
		txtpnSpecies.setEditable(false);
		txtpnSpecies.setText("Species:");
		txtpnSpecies.setBounds(10, 143, 50, 20);
		jPanel.add(txtpnSpecies);
		
		JTextPane txtpnAddNewPet = new JTextPane();
		txtpnAddNewPet.setEditable(false);
		txtpnAddNewPet.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpnAddNewPet.setText("Add New Pet");
		txtpnAddNewPet.setBounds(54, 46, 89, 26);
		jPanel.add(txtpnAddNewPet);
		
		btnAddPet = new JButton("Add Pet");
		btnAddPet.setBounds(88, 176, 89, 23);
		jPanel.add(btnAddPet);
		
		adoptBtn = new JButton("Adopt");
		adoptBtn.setBounds(157, 252, 89, 23);
		jPanel.add(adoptBtn);
		
		
		
		selectPetType.setRenderer(new ListCellRenderer<>() {
		    private final DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();

		    @Override
		    public Component getListCellRendererComponent(JList<?> list, Object value, int index,
		                                                  boolean isSelected, boolean cellHasFocus) {
		        JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(
		                list, value, index, isSelected, cellHasFocus);
		        
		        if (value instanceof Pet) {
		            renderer.setText(value.getClass().getSimpleName());
		        } else {
		            renderer.setText("Unknown");
		        }

		        return renderer;
		    }
		});

		
	
		
	}
	
	/**
	 * Start
	 */
	public void start() {
		inputFrame.setVisible(true);
	}
	
	/**
	 * Returns new pet age
	 * @return
	 */
	public Integer getNewPetAge() {
		String docAge = ageField.getText();
		if(docAge.equals(null)) {
			return 0;
		}
		Integer age = Integer.parseInt(docAge);
		return age;
	}
	
	/**
	 * Returns new pet name
	 * @return
	 */
	public String getNewPetName() {
		if(nameField.getText().equals(null)) {
			return "";
		} else {
		return nameField.getText();
	}
		
	}
	
	/**
	 * Returns pet type
	 * @return
	 */
	public JComboBox getSelectTypeBtn() {
		return this.selectPetType;
	}
	
	/**
	 * listener for adoption button
	 * @param e
	 */
	public void addAdoptBtnListener(ActionListener e) {
		
		adoptBtn.addActionListener(e);
		
	}
	
	/**
	 * Listener for sort Type 
	 * @param a
	 */
	public void addSortTypeListener(ActionListener a) {
		sortByComboBox.addActionListener(a);
	}
	
	/**
	 * Listener for removing button
	 * @param a
	 */
	public void addRmvBtnListener(ActionListener a) {
		rmvBtn.addActionListener(a);
	}
	
	/**
	 * Listener for add pet button
	 * @param a
	 */
	public void addPetBtnListener(ActionListener a) {
		btnAddPet.addActionListener(a);
	}
	
	/**
	 * Returns inputFrame
	 * @return
	 */
	public JFrame getInputFrame() {
		return inputFrame;
	}
	
	/**
	 * Returns jPanel
	 * @return
	 */
	public JPanel getjPanel() {
		return jPanel;
	}
	
	/**
	 * Returns the comboBox of sorting options
	 * @return
	 */
	public JComboBox<?> getSortComboBox() {
		return sortByComboBox;
	}
	
	/**
	 * Returns list
	 * @return
	 */
	public JList<?> getList() {
		return list;
	}
	
	/**
	 * Returns Button
	 * @return
	 */
	public JButton getRmvBtn() {
		return rmvBtn;
	}
}
