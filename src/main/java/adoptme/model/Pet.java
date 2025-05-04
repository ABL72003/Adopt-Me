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
	
	Pet(){
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public int getID() {
		return id;
	}
	
	public boolean getAdoptionStatus() {
		return adopted;
	}
	
	public abstract String getType();
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public void setAdoptionStatus(boolean adopted) {
	    // Don't allow un-adopting once adopted
	    if (this.adopted && !adopted) {
	        System.out.println("Cannot un-adopt a pet once adopted.");
	        return;
	    }
	    
	    // Only allow setting to true if not already adopted
	    if (!this.adopted && adopted) {
	        this.adopted = true;
	    }
	}
	
	@Override
	public int compareTo(Pet otherPet) {
		return this.name.compareTo(otherPet.getName());  // Default comparison by name
	}
	
	@Override
	public String toString() {
	    return ", Name: " + getName() + ", Species: " + getSpecies() +  ", Age: " + getAge() +
	           ", ID: " + getID() + ", Adopted: " + getAdoptionStatus();
	}
}
