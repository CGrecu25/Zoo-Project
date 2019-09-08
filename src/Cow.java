
public class Cow implements Animal{
	
	public String getSound() {
        return "Muuu";
    }

    public String getWhatEats() {
        return "grass";
    }
    
    public String getSleep() {
        return "in the stable";
    }

    @Override
    public String getName() {
        return this.getClass().getName();
    }


}
