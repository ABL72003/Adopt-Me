package adoptme.model;

import java.util.Comparator;

public class SortBySpecies implements Comparator<Pet>  {
	
	/**
	 * Override for compare
	 */
	@Override
    public int compare(Pet p1, Pet p2) {
        return p1.getSpecies().compareToIgnoreCase(p2.getSpecies());
    }
	
	/**
	 * Returns species
	 */
	public String toString() {
		return "Species";
	}
}
