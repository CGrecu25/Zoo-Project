import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		
		  System.out.println( "The ZOO has the following animals: ");
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(new Cat());
		animalList.add(new Cow());
		animalList.add(new Bird()); 
		animalList.add(new Frog()); 
		animalList.add(new Dog()); 

        for (int position = 0; position < animalList.size(); position++) {
            Animal animals = animalList.get(position);
            System.out.println(animals.getName() +" make " + animals.getSound() + " eats " + animals.getWhatEats() + " and sleep " + animals.getSleep());
      
        }
        
        for (PriceFactory.PriceType priceType : PriceFactory.PriceType.values()) {
            System.out.println("Price for " + priceType + " is " + PriceFactory.createPrice(priceType).getPrice());
        }
        
        Zoo CityZoo = new Zoo();
        CityZoo.setName("CityZoo");
        CityZoo.addAnimal(new Cat());
        CityZoo.addAnimal(new Cow());
        CityZoo.addAnimal(new Dog());
        System.out.println("Animals from zoo " + CityZoo.getName());
        ArrayList<Animal> animalsZoo1 = CityZoo.getAllAnimals();
        for (int poz = 0 ; poz < animalsZoo1.size();poz ++) {
        	Animal animal = animalsZoo1.get(poz);
        	System.out.println(animal.getName());
        }
        
        Zoo BlaBlaZoo = new Zoo();
        BlaBlaZoo.setName("BlaBlaZoo");
        BlaBlaZoo.addAnimal(new Bird());
        BlaBlaZoo.addAnimal(new Frog());
        System.out.println("Animals from zoo " + BlaBlaZoo.getName());
        ArrayList<Animal> animalsZoo2 = BlaBlaZoo.getAllAnimals();
        for (int poz = 0 ; poz < animalsZoo2.size();poz ++) {
        	Animal animal = animalsZoo2.get(poz);
        	System.out.println(animal.getName());
        }
        
        System.out.println("Animals all over the world ");
        ArrayList<Animal> animalsGlobal = BlaBlaZoo.getAllAnimalsFromInventory();
        for (int poz = 0 ; poz < animalsGlobal.size();poz ++) {
        	Animal animal = animalsGlobal.get(poz);
        	System.out.println(animal.getName());
        }
	}
}
