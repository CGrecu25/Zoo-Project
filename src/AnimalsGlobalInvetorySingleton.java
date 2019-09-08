import java.util.ArrayList;

public class AnimalsGlobalInvetorySingleton {
	
	ArrayList<Animal> animalsList = new ArrayList<>();
	
	// static variable single_instance of type AnimalsGlobalInvetory 
    private static AnimalsGlobalInvetorySingleton animalsGlobalInventorySingleInstance = null; 
  
    // private constructor restricted to this class itself 
    private AnimalsGlobalInvetorySingleton() 
    { 
    	animalsList = new ArrayList<>();
    } 
  
    // static method to create instance of Singleton class 
    public static AnimalsGlobalInvetorySingleton getInstance() 
    { 
        if (animalsGlobalInventorySingleInstance == null) 
        	animalsGlobalInventorySingleInstance = new AnimalsGlobalInvetorySingleton(); 
  
        return animalsGlobalInventorySingleInstance; 
    } 
    
    public void addAnimal(Animal animal) {
    	animalsList.add(animal);
    }
    
    public ArrayList<Animal> getAnimals(){
    	return animalsList;
    }

}
