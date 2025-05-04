package adoptme.controller;

import adoptme.model.Cat;
import adoptme.model.Shelter;

public class Main2 {

	public static void main(String[] args) {
	
		ShelterController shelterController = new ShelterController();
		
		Cat cat = new Cat("Ren", 10, "Cat", true);
		
		shelterController.getShelter().addPet(cat);
		
		Shelter shelter = shelterController.getShelter();
		shelter.viewPets();
		shelter.getList();
		shelterController.start();
	}

}
