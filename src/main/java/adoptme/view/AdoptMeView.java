package adoptme.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionListener;

import adoptme.model.Pet;
import adoptme.model.Shelter;

import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JComboBox;

public class AdoptMeView extends JFrame{
	
	private JFrame inputFrame;
	private JPanel jPanel;
	private JComboBox<?> comboBox;
	private JList<?> list;
	
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
		comboBox.setBounds(636, 51, 121, 21);
		jPanel.add(comboBox);
		
		JTextPane txtpnSortBy = new JTextPane();
		txtpnSortBy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnSortBy.setText("Sort By:");
		txtpnSortBy.setBounds(536, 51, 72, 26);
		jPanel.add(txtpnSortBy);
	
		
	}
	
	public void addComboListener(ActionListener e) {
		
		comboBox.addActionListener(e);
		
	}
	
	public void addSelectListener(ListSelectionListener e) {
		ListSelectionModel selectModel = list.getSelectionModel();
		
		selectModel.addListSelectionListener(e);
	}
}
