package adoptme.model;

public abstract class Pet implements Comparable<Pet> {
	private String name;
	private int age;
	private String species;
	private int id;
	private boolean adopted;//true means adopted false means not adopted
	
	/**
	 * Constructor for files
	 * @param name
	 * @param age
	 * @param species
	 * @param id
	 * @param adopted
	 */
	public Pet(String name, int age, String species, int id, boolean adopted) {
		this.name = name;
		this.age = age;
		this.species = species;
		this.id = id;
		this.adopted = adopted;
	}
	
	/**
	 * Constructor for user input
	 * @param name
	 * @param age
	 * @param species
	 * @param adopted
	 */
	public Pet(String name, int age, String species, boolean adopted) {
		this.name = name;
		this.age = age;
		this.species = species;
		this.adopted = adopted;
	}
	
	/**
	 * Constructor calling pet
	 */
	public Pet() {
		
	}
	
	/**
	 * Returns name of pet
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns age of pet
	 * @return
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Returns pet species
	 * @return
	 */
	public String getSpecies() {
		return species;
	}
	
	/**
	 * Returns pet ID
	 * @return
	 */
	public int getID() {
		return id;
	}
	
	/**
	 * Returns pet's adoption status
	 * @return
	 */
	public boolean getAdoptionStatus() {
		return adopted;
	}
	
	/**
	 * Abstract method that returns pet type
	 * @return
	 */
	public abstract String getType();
	
	/**
	 * Takes user input of the pet name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Takes user input of pet's age
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Takes user input of pet's species
	 * @param species
	 */
	public void setSpecies(String species) {
		this.species = species;
	}
	
	/**
	 * Takes user input of the pet's ID
	 * @param id
	 */
	public void setID(int id) {
		this.id = id;
	}
	
	/**
	 * Takes user input of the pet's adoption status
	 * @param adopted
	 */
	public void setAdoptionStatus(boolean adopted) {
	    // Pet can't be unadopted  
	    if (this.adopted && !adopted) {
	        System.out.println("Cannot un-adopt a pet once adopted.");
	        return;
	    }
	    
	    // Only allow setting to true if not already adopted
	    if (!this.adopted && adopted) {
	        this.adopted = true;
	    }
	}
	
	/**
	 * Compares pets names
	 */
	@Override
	public int compareTo(Pet otherPet) {
		return this.name.compareTo(otherPet.getName());  // Default comparison by name
	}
	
	/**
	 * Prints pet information
	 */
	@Override
	public String toString() {
	    return "Name: " + getName() + ", Species: " + getSpecies() +  ", Age: " + getAge() +
	           ", ID: " + getID() + ", Adopted: " + getAdoptionStatus();
	}
}
