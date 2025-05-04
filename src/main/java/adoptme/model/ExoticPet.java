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
	
	//getters and setters for the new fields.
	public String getUniqueId() {
		return uniqueId;
	}


	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}


	public String getCategory() {
		return category;
	}


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
	
	public String toString() {
		return "Exotic";
	}
	
	
}
