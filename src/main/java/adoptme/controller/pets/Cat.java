package adoptme.controller.pets;

public class Cat extends Pet{
	/**
	 * Constructor for files
	 * @param name
	 * @param age
	 * @param species
	 * @param id
	 * @param adopted
	 */
	public Cat(String name, int age, String species, int id, boolean adopted) {
		
		super(name, age, species, id, adopted); // Calls Pet's constructor
	}
	
	/**
	 * Constructor for users
	 * @param name
	 * @param age
	 * @param species
	 * @param adopted
	 */
	public Cat(String name, int age, String species, boolean adopted) {
		
		super(name, age, species, adopted); // Calls Pet's constructor
	}
	
	@Override
	public String getType() {
		return "Cat";
	}
	
	@Override
	public String toString() {
	    return "[ID: " + getID() + ", Name:" + getName() + ", Age: " + getAge() + ", Species: "
	    		+ getSpecies() + ", Adopted: " + getAdoptionStatus() + ", Type: " + getType() + "]";
	}

}
