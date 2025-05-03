package adoptme.view;

import adoptme.model.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a Shelter for Pets
        Shelter<Pet> shelter = new Shelter<>();
        

        // Add some pets to the shelter
        shelter.addPet(new Dog("Buddy", 3, "Golden Retriever", 1, false));
        shelter.addPet(new Cat("Whiskers", 2, "Siamese", 2, true));
        shelter.addPet(new Dog("Charlie", 5, "Labrador", 3, false));
        shelter.addPet(new Cat("Luna", 1, "Persian", 4, false));

        // View Pets in their original order
        System.out.println("=== All Pets (Original Order) ===");
        shelter.viewPets();

        // Sort by name (Comparable)
        Collections.sort(shelter.getListOfPets());  // Uses compareTo in Pet class (default sort by name)
        System.out.println("\n=== Sorted by Name ===");
        shelter.viewPets();

        // Sort by age using SortByAge comparator
        shelter.getListOfPets().sort(new SortByAge());
        System.out.println("\n=== Sorted by Age ===");
        shelter.viewPets();

        // Sort by species using SortBySpecies comparator
        shelter.getListOfPets().sort(new SortBySpecies());
        System.out.println("\n=== Sorted by Species ===");
        shelter.viewPets();
        
     // Test adoptPet method
        System.out.println("\n=== Adoption Test ===");

        // Try adopting a pet
        Pet petToAdopt = shelter.getListOfPets().get(0); // e.g., Buddy
        System.out.println("Attempting to adopt: " + petToAdopt.getName());
        shelter.adoptPet(petToAdopt);

        // Try adopting the same pet again to check duplicate adoption prevention
        System.out.println("Attempting to adopt again: " + petToAdopt.getName());
        shelter.adoptPet(petToAdopt);
    }
}