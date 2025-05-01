package adoptme.controller.shelter;

import java.util.ArrayList;

import adoptme.controller.pets.Pet;

/**
 * Stores Pets
 * @param <T>
 */
public class Shelter <T extends Pet> {
	private ArrayList<T> listOfPets = new ArrayList<T>();
	
	
	
}
