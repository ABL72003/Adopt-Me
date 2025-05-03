package adoptme.model;
//This converts ExoticAnimals (placeholder) into ExoticPet.
public class ExoticAnimalAdapter {
	
/**
 * Converts raw data extracted from Json file from Exotic Animal, creates a ExoticPet then stores all the information in the Pet fields
 * Returns the new exotic pet to be stored.
 * @param animal
 * @return
 */
	public ExoticPet convertFromJson(ExoticAnimal animal) {
        String name = animal.getAnimalName();
        int age = animal.getYearsOld();
        String species = animal.getSubSpecies();
        String id = animal.getUniqueId();
        String category = animal.getCategory();

        return new ExoticPet(name,age,species,false,id,category);
    }
}
	 


