package adoptme.model;

//this information is what will actually be displayed
public class ExoticPet extends Pet{

	//only need these two because they are unique to the exotic pet.
	private String uniqueId;
	private String category;
	/**
	 * constructor that takes the already existing parameters, the parameters that can be converted and the new "unique" parameters 
	 * @param name
	 * @param age
	 * @param species
	 * @param adopted
	 * @param uniqueId
	 * @param category
	 */
	public ExoticPet(String name, int age, String species, boolean adopted, String uniqueId, String category) {
		
		//Calls the constructor of the Pet superclass to initialize common fields
		//like name, age, species, and adopted status for this ExoticPet
		super(name, age, species, adopted);
		
		this.uniqueId = uniqueId;
		this.category = category;
	}
	
	public ExoticPet() {
		
	}
	
	/**
	 * Constructor for exotic pets for the users
	 * @param name
	 * @param age
	 * @param species
	 * @param adopted
	 */
	public ExoticPet(String name, int age, String species, boolean adopted) {
		super(name,age,species,adopted);
	}
	
	/**
	 * Returns uniqueID
	 * @return
	 */
	public String getUniqueId() {
		return uniqueId;
	}

	/**
	 * Takes user's input of an exotic animal's uniqueID
	 * @param uniqueId
	 */
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	/**
	 * Returns category
	 * @return
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Takes user's input of a category
	 * @param category
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	
	/**
	 * override that returns the type of exotic if prompted.
	 */
	@Override
	public String getType() {
		return "exotic";
	}
	
	/**
	 * Prints exotic
	 */
	public String toString() {
		return "Exotic";
	}
	
	
}
