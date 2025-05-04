package adoptme.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
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
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;

public class AdoptMeView extends JFrame{

	private JPanel jPanel;
	private JComboBox<Object> comboBox;
	private JList<?> list;
	private JFrame inputFrame;
	private SortByAge ageSort = new SortByAge();
	private SortBySpecies speciesSort = new SortBySpecies();
	private JButton rmvBtn;
	private JTextField nameField;
	private JTextField ageField;
	private JComboBox<Object> selectPetType;
	private JButton btnAddPet;
	
	public AdoptMeView(Shelter<?> s) {
		inputFrame = new JFrame();
		inputFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		inputFrame.setSize(800,400);
		jPanel = new JPanel();
		jPanel.setBorder(new EmptyBorder(5,5,5,5));
		inputFrame.getContentPane().add(jPanel);
		jPanel.setLayout(null);
		
		list = new JList<Object>(s.getList());
		list.setBounds(254, 82, 503, 227);
		jPanel.add(list);
		comboBox = new JComboBox<Object>();
		comboBox.addItem(ageSort);
		comboBox.addItem(speciesSort);
		comboBox.setBounds(636, 51, 121, 21);
		jPanel.add(comboBox);
		
		JTextPane txtpnSortBy = new JTextPane();
		txtpnSortBy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnSortBy.setText("Sort By:");
		txtpnSortBy.setBounds(536, 51, 72, 26);
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
		txtpnName.setText("Name:");
		txtpnName.setBounds(23, 82, 37, 20);
		jPanel.add(txtpnName);
		
		JTextPane txtpnAge = new JTextPane();
		txtpnAge.setText("Age:");
		txtpnAge.setBounds(23, 112, 37, 20);
		jPanel.add(txtpnAge);
		
		JTextPane txtpnSpecies = new JTextPane();
		txtpnSpecies.setText("Species:");
		txtpnSpecies.setBounds(10, 143, 50, 20);
		jPanel.add(txtpnSpecies);
		
		JTextPane txtpnAddNewPet = new JTextPane();
		txtpnAddNewPet.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpnAddNewPet.setText("Add New Pet");
		txtpnAddNewPet.setBounds(54, 46, 89, 26);
		jPanel.add(txtpnAddNewPet);
		
		btnAddPet = new JButton("Add Pet");
		btnAddPet.setBounds(88, 176, 89, 23);
		jPanel.add(btnAddPet);
		
		
	
		
	}
	
	public Integer getNewPetAge() {
		String docAge = ageField.getText();
		if(docAge.equals(null)) {
			return 0;
		}
		Integer age = Integer.parseInt(docAge);
		return age;
	}
	
	public String getNewPetName() {
		if(nameField.getText().equals(null)) {
			return "";
		} else {
		return nameField.getText();
	}
	}
	
	public JComboBox getSelectTypeBtn() {
		return this.selectPetType;
	}
	
	
	public void addSortTypeListener(ActionListener a) {
		comboBox.addActionListener(a);
	}
	
	
	public void addRmvBtnListener(ActionListener a) {
		rmvBtn.addActionListener(a);
	}
	
	
	public void addPetBtnListener(ActionListener a) {
		btnAddPet.addActionListener(a);
	}
	
	
	public JFrame getInputFrame() {
		return inputFrame;
	}

	public JPanel getjPanel() {
		return jPanel;
	}

	public JComboBox<?> getComboBox() {
		return comboBox;
	}

	public JList<?> getList() {
		return list;
	}

	public JButton getRmvBtn() {
		return rmvBtn;
	}
}
