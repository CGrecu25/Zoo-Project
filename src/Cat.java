
public class Cat implements Animal{
	
	public String getSound() {
        return "Meaw";
    }
    
    public String getWhatEats() {
        return "mouses";
    }
    
    public String getSleep() {
        return "10 hours";
    }

    @Override
    public String getName() {
        return this.getClass().getName();
    }

}