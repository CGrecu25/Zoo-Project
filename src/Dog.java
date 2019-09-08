
public class Dog implements Animal{
	
	public String getSound() {
        return "Ham-Ham";
    }
    
    public String getWhatEats() {
        return "meat";
    }
    
    public String getSleep() {
        return "9 hours";
    }

    @Override
    public String getName() {
        return this.getClass().getName();
    }

}