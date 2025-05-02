package adoptme.model;

import java.util.ArrayList;

/**
 * Stores Pets
 * @param <T>
 */
public class Shelter <T extends Pet> {
	private ArrayList<T> listOfPets = new ArrayList<T>();

	
	public void addPet(T pet) {
		listOfPets.add(pet);
	}
	
	public void deletePet(T pet) {
		int index = listOfPets.indexOf(pet);
		
		if(index == -1) {
			System.out.println("Pet was not found in our system.");
			return;
		}
		
		listOfPets.remove(index);
		System.out.println("Pet was successfully deleted from our system.");
	}
	
	public void viewPets() {
		for (T pet : listOfPets) {
	        System.out.println(pet);
	    }
	}
	
	
	
}
