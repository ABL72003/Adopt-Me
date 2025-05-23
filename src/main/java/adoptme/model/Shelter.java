package adoptme.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.DefaultListModel;

/**
 * Stores Pets
 * @param <T>
 */
public class Shelter <T extends Pet> {
	private DefaultListModel<T> listOfPets = new DefaultListModel<>();
	
	/**
	 * Constructor for shelter
	 */
	public Shelter() {
	}
	
	/**
	 * Adds a pet to the list 
	 * @param pet
	 */
    public void addPet(T pet) {
    	pet.setAdoptionStatus(false);
        listOfPets.addElement(pet);
        
    }
    
    /**
     * Deletes a pet from the list
     * @param pet
     */
	public void deletePet(T pet) {
		int index = listOfPets.indexOf(pet);
		
		if(index == -1) {
			System.out.println("Pet was not found in our system.");
			return;
		}
		listOfPets.remove(index);
		System.out.println("Pet was successfully deleted from our system.");
	
	}
	
	/**
	 * Deletes a pet from the list given an index
	 * @param index
	 */
    public void deletePet(int index) {
        if (index < 0 || index >= listOfPets.size()) {
            System.out.println("Pet was not found in our system.");
            return;
        }
        listOfPets.remove(index);
        System.out.println("Pet was successfully deleted from our system.");
    }
	

	/**
	 * Adopts a pet from the list if pet hasn't been adopted yet
	 * @param pet
	 */
	public void adoptPet(Pet pet) {
		
		if(pet.getAdoptionStatus() == true) {
			System.out.println("" + pet.getName() + " was already adopted");
			return;
		}
		pet.setAdoptionStatus(true);
		System.out.println("Pet: " + pet.getName() + " was adopted!");
	}
	
	/**
	 * Returns a list of pets
	 * @return
	 */
    public DefaultListModel<T> getList() {
        return listOfPets;
    }
    
    /**
     * Sorts pets by age
     */
    public void sortPetsByAge() {
        // Convert DefaultListModel to List<Pet>
        List<T> petList = new ArrayList<>();
        for (int i = 0; i < listOfPets.getSize(); i++) {
            petList.add(listOfPets.get(i));
        }
        
        // Sort the List<Pet>
        petList.sort(new SortByAge());
        
        // Convert the sorted List<Pet> back to DefaultListModel
        DefaultListModel<T> sortedModel = new DefaultListModel<>();
        for (T pet : petList) {
            sortedModel.addElement(pet);
        }
        
        // Set the sorted model back to the pets DefaultListModel
        listOfPets = sortedModel;  // Update the DefaultListModel with the sorted one
    }

    	/**
    	 * Sorts pets by species
    	 */
    public void sortPetsBySpecies() {
        List<T> petList = new ArrayList<>();
        for (int i = 0; i < listOfPets.getSize(); i++) {
            petList.add(listOfPets.get(i));  // Get all pets in List<Pet>
        }
        
        petList.sort(new SortBySpecies());  // Sort by species
        
        DefaultListModel<T> sortedModel = new DefaultListModel<>();
        for (T pet : petList) {
            sortedModel.addElement(pet);  // Add sorted pets to the DefaultListModel
        }
        
        listOfPets = sortedModel;  // Update the DefaultListModel with the sorted one
    }
    
    /**
     * Sorts pets by name
     */
    public void sortPetsByName() {
        // Convert DefaultListModel to List<Pet>
        List<T> petList = new ArrayList<>();
        for (int i = 0; i < listOfPets.size(); i++) {
            petList.add(listOfPets.get(i));
        }

        Collections.sort(petList);  

        // Convert sorted List<Pet> back to DefaultListModel
        DefaultListModel<T> sortedModel = new DefaultListModel<>();
        for (T pet : petList) {
            sortedModel.addElement(pet);
        }

        // Set sorted model
        listOfPets = sortedModel;
    }
    
}
