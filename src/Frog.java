
public class Frog implements Animal{
	
	
	public String getSound() {
        return "Oac-Oac";
    }

    public String getWhatEats() {
        return "insects";
    }
    
    public String getSleep() {
        return "in the water";
    }

    @Override
    public String getName() {
        return this.getClass().getName();
    }


}
