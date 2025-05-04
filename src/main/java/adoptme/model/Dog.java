package adoptme.model;

public class Dog extends Pet{
	
	/**
	 * Constructor for files
	 * @param name
	 * @param age
	 * @param species
	 * @param id
	 * @param adopted
	 */
	public Dog(String name, int age, String species, int id, boolean adopted) {
		
		super(name, age, species, id, adopted); // Calls Pet's constructor
	}
	
	public Dog(){
		
	}
	
	/**
	 * Constructor for users
	 * @param name
	 * @param age
	 * @param species
	 * @param adopted
	 */
	public Dog(String name, int age, String species, boolean adopted) {
		
		super(name, age, species, adopted); // Calls Pet's constructor
	}
	
	@Override
	public String toString() {
		return "Dog";
	}
	
	@Override
	public String getType() {
	    return "Type: " + getType() + super.toString();
	}
}
