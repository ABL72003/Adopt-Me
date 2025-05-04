package adoptme.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionListener;

import adoptme.model.Pet;
import adoptme.model.Shelter;
import adoptme.model.SortByAge;
import adoptme.model.SortBySpecies;

import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AdoptMeView extends JFrame{

	private JPanel jPanel;
	private JComboBox<Object> comboBox;
	private JList<?> list;
	private JFrame inputFrame;
	private SortByAge ageSort = new SortByAge();
	private SortBySpecies speciesSort = new SortBySpecies();
	private JButton rmvBtn;
	
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
		
		
	
		
	}
	
	
	
	
	public void addRmvBtnListener(ActionListener a) {
		rmvBtn.addActionListener(a);
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
