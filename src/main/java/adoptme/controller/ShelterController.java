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
    
    
    public ShelterController(){
    	shelter = new Shelter<Pet>();
    	view = new AdoptMeView(shelter);
    	view.addRmvBtnListener(new RemoveBtnListen(shelter, view));
    	view.addPetBtnListener(new AddPetBtnListener(shelter, view));
    	
    	
    }
  
    
    
    public void start() {
    	view.start();
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
			
			
			if(view.getSelectTypeBtn().getSelectedItem().getClass().equals(Cat.class)){
				
				Pet newPet = new Cat(view.getNewPetName(),view.getNewPetAge(),view.getSelectTypeBtn().getSelectedItem().toString(),false);
				shelter.addPet(newPet);
			}
			
			if(view.getSelectTypeBtn().getSelectedItem().getClass().equals(Dog.class)) {
				
				Pet newPet = new Dog(view.getNewPetName(),view.getNewPetAge(),view.getSelectTypeBtn().getSelectedItem().toString(),false);
				shelter.addPet(newPet);
			}
			
			if(view.getSelectTypeBtn().getSelectedItem().getClass().equals(Rabbit.class)) {
				
				Pet newPet = new Rabbit(view.getNewPetName(),view.getNewPetAge(),view.getSelectTypeBtn().getSelectedItem().toString(),false);
				shelter.addPet(newPet);
			}
			
			if(view.getSelectTypeBtn().getSelectedItem().getClass().equals(ExoticPet.class)) {
				
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
    
    private class AdoptBtnListener implements ActionListener{
    	
    	private Shelter<Pet> s;
    	private AdoptMeView view;
    	
    	public void RemoveBtnListen(Shelter<Pet> s, AdoptMeView view){
    		this.s = s;
    		this.view = view;
    	}
    	
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			s.adoptPet(s.getList().get(view.getList().getSelectedIndex()));
			
		}
    	
    }
    
    
    public Shelter getShelter() {
    	return this.shelter;
    }
    
    
    
    
    
    
    
}