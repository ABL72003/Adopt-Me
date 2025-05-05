package adoptme.view;

import adoptme.model.Pet;
import adoptme.model.Shelter;

public class Main {

	public static void main(String[] args) {
		 Shelter<Pet> shelter = new Shelter<>();
		    AdoptMeView view = new AdoptMeView(shelter);
		    view.start();

	}

}
