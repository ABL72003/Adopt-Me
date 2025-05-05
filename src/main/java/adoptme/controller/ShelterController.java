package adoptme.controller;
import adoptme.model.Cat;
import adoptme.model.Dog;
import adoptme.model.ExoticPet;
import adoptme.model.Pet;
import adoptme.model.Rabbit;
import adoptme.model.Shelter;
import adoptme.model.SortByAge;
import adoptme.view.AdoptMeView;
import adoptme.view.Main;
import java.awt.event.*;
import java.util.List;

import javax.swing.JList;
import javax.swing.event.ListSelectionListener;

public class ShelterController {

	private Shelter<Pet> shelter;
    private AdoptMeView view;
    
    /**
     * Constructor for shelterController
     */
    public ShelterController(){
    	shelter = new Shelter<Pet>();
    	view = new AdoptMeView(shelter);
    	view.addRmvBtnListener(new RemoveBtnListen(shelter, view));
    	view.addPetBtnListener(new AddPetBtnListener(shelter, view));
    	
    	
    }
  
    
    /**
     * Start
     */
    public void start() {
    	view.start();
    	}
    
    
    /**
     * Button listener class
     */
    private class AddPetBtnListener implements ActionListener{
    	private Shelter<Pet> shelter;
    	private AdoptMeView view;
    	
    	/**
    	 * Adds pet button listener
    	 * @param shelter
    	 * @param view
    	 */
    	AddPetBtnListener(Shelter<Pet> shelter, AdoptMeView view){
    		this.shelter = shelter;
    		this.view = view;
    	}
    	
    	/**
    	 * override for actionPerformed
    	 */
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
    
    
    
    
    /**
     * Class for remove button
     */
    private class RemoveBtnListen implements ActionListener{
    	
    	private Shelter<Pet> s;
    	private AdoptMeView view;
    	
    	/**
    	 * Remove button listener
    	 * @param s
    	 * @param view
    	 */
    	RemoveBtnListen(Shelter<Pet> s, AdoptMeView view){
    		this.s = s;
    		this.view = view;
    	}
    	
    	/**
    	 * Override the action performed
    	 */
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			s.deletePet(view.getList().getSelectedIndex());
			
		}
    	
    }
    
    /**
     * Class for Adoption button Listener
     */
    private class AdoptBtnListener implements ActionListener{
    	
    	private Shelter<Pet> s;
    	private AdoptMeView view;
    	
    	/**
    	 * Removes button listener
    	 * @param s
    	 * @param view
    	 */
    	public void RemoveBtnListen(Shelter<Pet> s, AdoptMeView view){
    		this.s = s;
    		this.view = view;
    	}
    	
    	/**
    	 * Override for action performed
    	 */
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			s.adoptPet(s.getList().get(view.getList().getSelectedIndex()));
			
		}
    	
    }
    
    /**
     * Class for filtering the comboBox listener
     */
    private class FilterComboBoxListener implements ActionListener{
    	
    	/**
    	 * Override for action performed
    	 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(view.getSortComboBox().getSelectedItem().getClass().equals("Age")) {
				shelter.sortPetsByAge();
			}
			
			if(view.getSortComboBox().getSelectedItem().getClass().equals("Species")) {
				shelter.sortPetsBySpecies();
			}
			
			if(view.getSortComboBox().getSelectedItem().getClass().equals("Name")) {
				shelter.sortPetsByName();
			}
		}
   	

    }
    
    /**
     * Returns shelter
     * @return
     */
    public Shelter getShelter() {
    	return this.shelter;
    }
    
    
    
    
    
    
    
}