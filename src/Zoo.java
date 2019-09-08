import java.util.ArrayList;

public class Zoo {
	
	private  AnimalsGlobalInvetorySingleton animalsGlobalInventorySingleton;

	private ArrayList<Animal> animalList = new ArrayList<>();
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Zoo(){
		animalsGlobalInventorySingleton = AnimalsGlobalInvetorySingleton.getInstance();
	}

    public void addAnimal(Animal animal) {
	    animalList.add(animal);
	    animalsGlobalInventorySingleton.addAnimal(animal);
    }
    
    public ArrayList<Animal> getAllAnimals(){
    	return animalList;
    }
    
    public ArrayList<Animal> getAllAnimalsFromInventory(){
    	return animalsGlobalInventorySingleton.getAnimals();
    }
}
