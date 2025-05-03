package adoptme.model;

import java.util.Comparator;

public class SortByAge implements Comparator<Pet> {
	
	@Override
	public int compare(Pet p1, Pet p2) {
		return Integer.compare(p1.getAge(), p2.getAge());
	}
 
}
