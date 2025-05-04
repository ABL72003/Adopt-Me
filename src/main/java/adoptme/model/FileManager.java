package adoptme.model;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
//We haven't gone over this one in class but using my resources, this is the only import that I can file that will 
//efficiently open and close with the generics or exotic animals and regular pets without deserializing everything,  potentially causing errors.

import com.google.gson.reflect.TypeToken;
/**
 * Class that will contain the file opening and saving 
 */
public class FileManager {
	/**
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
    public static List<Pet> loadPets(String path) throws IOException {
    	
    	FileReader reader = new FileReader(path);
        List<Pet> pets = new Gson().fromJson(reader, new TypeToken<List<Pet>>() {}.getType());
        reader.close();//close file
        return pets;//return regular pets from Json file
        	}
    /**
     * static method that will open the exotic animal json file, close the file and return the animals.
     * @param path
     * @return
     * @throws IOException
     */
    public static List<ExoticAnimal> loadExoticAnimals(String path) throws IOException {
        
    	FileReader reader = new FileReader(path);
        List<ExoticAnimal> animals = new Gson().fromJson(reader, new TypeToken<List<ExoticAnimal>>() {}.getType());
        reader.close();//close file
        return animals;//return exotic animals from Json file 
        	}
    
    /**
     * void method that will save the pets into the json file given and close it.
     * @param pets
     * @param Path
     * @throws IOException
     */
    public static void savePets(List<Pet> pets, String Path) throws IOException {
    	FileWriter writer = new FileWriter(Path);
        new Gson().toJson(pets, writer);
        writer.close();//close file
    }
    /**
     * void function that saves the eexotic animals in the exoti_animals.json file.
     * @param Exotic
     * @param Path
     * @throws IOException
     */
    public static void saveExotic(List<ExoticAnimal> Exotic, String Path) throws IOException {
        FileWriter writer = new FileWriter(Path);
        new Gson().toJson(Exotic,writer);
        writer.close();//close file
    }
}