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
	
	public Rabbit() {
	}
	
	/**
	 * Returns pet type
	 */
	@Override
	public String getType() {
		return "Rabbit";
	}
	
	/**
	 * prints pet information
	 */
	@Override
	public String toString() {
		 return super.toString();
	}
}
