package adoptme.controller;
import adoptme.model.Pet;
import adoptme.model.Shelter;
import adoptme.view.AdoptMeView;
import adoptme.view.Main;
import java.awt.event.*;
import java.util.List;

import javax.swing.JList;
import javax.swing.event.ListSelectionListener;

public class ShelterController {

	private Shelter<Pet> shelter;
    private AdoptMeView view;
    
    
    ShelterController(){
    	shelter = new Shelter<Pet>();
    	view = new AdoptMeView(shelter);
    	view.addRmvBtnListener(new RemoveBtnListen(shelter, view.getList()));
    	
    	
    	
    }
  
    
    
    
    
    
    
    
    private class RemoveBtnListen implements ActionListener{
    	
    	private Shelter<Pet> s;
    	private JList<Object> list;
    	
    	RemoveBtnListen(Shelter<Pet> s, JList list){
    		this.s = s;
    		this.list = list;
    	}
    	
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			s.deletePet(list.getSelectedIndex());
			
		}
    	
    }
    
    
    
    
    
    
    
    
    
}