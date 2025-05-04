package adoptme.controller;

import adoptme.model.Cat;

public class Main2 {

	public static void main(String[] args) {
	
		ShelterController shelterController = new ShelterController();
		
		Cat cat = new Cat("Ren", 10, "Cat", false);
		
		shelterController.getShelter().addPet(cat);

	}

}
