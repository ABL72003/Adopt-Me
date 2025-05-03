package adoptme.model;

public class Rabbit extends Pet{
	/**
	 * Constructor for files
	 * @param name
	 * @param age
	 * @param species
	 * @param id
	 * @param adopted
	 */
	public Rabbit(String name, int age, String species, int id, boolean adopted) {
		
		super(name, age, species, id, adopted); // Calls Pet's constructor
	}
	
	/**
	 * Constructor for users
	 * @param name
	 * @param age
	 * @param species
	 * @param adopted
	 */
	public Rabbit(String name, int age, String species, boolean adopted) {
		
		super(name, age, species, adopted); // Calls Pet's constructor
	}
	
	@Override
	public String getType() {
		return "Rabbit";
	}
	
	@Override
	public String toString() {
		 return "Type: " + getType() + super.toString();
	}

}
