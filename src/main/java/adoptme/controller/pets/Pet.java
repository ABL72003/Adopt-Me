package adoptme.controller.pets;

public abstract class Pet {
	private String name;
	private int age;
	private String species;
	private int id;
	private boolean adopted;
	
	public Pet(String name, int age, String species, int id, boolean adopted) {
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
	
	public boolean getAdoption() {
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
	
	public abstract void setType(String type);
}
