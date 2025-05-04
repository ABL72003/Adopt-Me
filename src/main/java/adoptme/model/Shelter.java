package adoptme.model;

import javax.swing.DefaultListModel;

/**
 * Stores Pets
 * @param <T>
 */
public class Shelter <T extends Pet> {
	private DefaultListModel<T> listOfPets = new DefaultListModel<>();

	public Shelter() {
	}
	
    public void addPet(T pet) {
    	pet.setAdoptionStatus(false);
        listOfPets.addElement(pet);
        
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
	
	
    public void deletePet(int index) {
        if (index < 0 || index >= listOfPets.size()) {
            System.out.println("Pet was not found in our system.");
            return;
        }
        listOfPets.remove(index);
        System.out.println("Pet was successfully deleted from our system.");
    }
	

	
	public void adoptPet(Pet pet) {
		
		if(pet.getAdoptionStatus() == true) {
			System.out.println("" + pet.getName() + " was already adopted");
			return;
		}
		pet.setAdoptionStatus(true);
		System.out.println("Pet: " + pet.getName() + " was adopted!");
	}

    public DefaultListModel<T> getList() {
        return listOfPets;
    }
    
    
}
