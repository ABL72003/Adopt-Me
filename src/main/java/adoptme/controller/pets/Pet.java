package adoptme.controller.pets;

public abstract class Pet {
	private String name;
	private int age;
	private String species;
	private int id;
	private boolean adopted;
	private String type;
	
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
		this.id = id;
		this.adopted = adopted;
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
	
	public void setAdoption(boolean adopted) {
		this.adopted = adopted;
	}
}
