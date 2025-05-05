package adoptme.model;

//this file is almost a temporary date holder for the Json file being read
// used only for parsing JSON with Gson
public class ExoticAnimal{
	
//fields to match what's in the exotic_aniamls.json file.
	private String uniqueId;
    private String animalName;
    private String category;
    private String subSpecies;
    private int yearsOld;
	
    
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
	 * Returns animal name
	 * @return
	 */
	public String getAnimalName() {
		return animalName;
	}
	
	/**
	 * Takes user's input of an exotic animal's name
	 * @param animalName
	 */
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	
	/**
	 * Returns category
	 * @return
	 */
	public String getCategory() {
		return category;
	}
	
	/**
	 * Takes a user's input of a category
	 * @param category
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	
	/**
	 * Returns subspecies
	 * @return
	 */
	public String getSubSpecies() {
		return subSpecies;
	}
	
	/**
	 * Takes a user's input of subspecies
	 * @param subSpecies
	 */
	public void setSubSpecies(String subSpecies) {
		this.subSpecies = subSpecies;
	}
	
	/**
	 * Returns age
	 * @return
	 */
	public int getYearsOld() {
		return yearsOld;
	}
	
	/**
	 * Takes a user's input of the age
	 * @param yearsOld
	 */
	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

}