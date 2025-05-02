package adoptme.model;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.ListModel;

/**
 * Stores Pets
 * @param <T>
 */
public class Shelter <T extends Pet> {
	private Vector<T> listOfPets = new Vector<T>();

	public Shelter() {	
	}
	
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
	
	public Vector<T> getList(){
		return this.listOfPets;
	}
	
	
	
}
