package adoptme.controller;
import adoptme.model.Cat;
import adoptme.model.Dog;
import adoptme.model.ExoticPet;
import adoptme.model.Pet;
import adoptme.model.Rabbit;
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
    	view.setVisible(true);
    	view.addRmvBtnListener(new RemoveBtnListen(shelter, view));
    	view.addPetBtnListener(new AddPetBtnListener(shelter, view));
    	
    	
    }
  
    
    
    
    
    
    
    private class AddPetBtnListener implements ActionListener{
    	private Shelter<Pet> shelter;
    	private AdoptMeView view;
    	
    	AddPetBtnListener(Shelter<Pet> shelter, AdoptMeView view){
    		this.shelter = shelter;
    		this.view = view;
    	}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
			if(view.getSelectTypeBtn().getSelectedItem().toString() == "Cat") {
				
				Pet newPet = new Cat(view.getNewPetName(),view.getNewPetAge(),view.getSelectTypeBtn().getSelectedItem().toString(),false);
				shelter.addPet(newPet);
			}
			
			if(view.getSelectTypeBtn().getSelectedItem().toString() == "Dog") {
				
				Pet newPet = new Dog(view.getNewPetName(),view.getNewPetAge(),view.getSelectTypeBtn().getSelectedItem().toString(),false);
				shelter.addPet(newPet);
			}
			
			if(view.getSelectTypeBtn().getSelectedItem().toString() == "Rabbit") {
				
				Pet newPet = new Rabbit(view.getNewPetName(),view.getNewPetAge(),view.getSelectTypeBtn().getSelectedItem().toString(),false);
				shelter.addPet(newPet);
			}
			
			if(view.getSelectTypeBtn().getSelectedItem().toString() == "Exotic") {
				
				Pet newPet = new ExoticPet(view.getNewPetName(),view.getNewPetAge(),view.getSelectTypeBtn().getSelectedItem().toString(),false);
				shelter.addPet(newPet);
			}
			
		}
    	
    	
    	
    }
    
    
    
    
    
    private class RemoveBtnListen implements ActionListener{
    	
    	private Shelter<Pet> s;
    	private AdoptMeView view;
    	
    	RemoveBtnListen(Shelter<Pet> s, AdoptMeView view){
    		this.s = s;
    		this.view = view;
    	}
    	
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			s.deletePet(view.getList().getSelectedIndex());
			
		}
    	
    }
    
    
    
    
    
    
    
    
    
}