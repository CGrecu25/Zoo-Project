
public class Bird implements Animal{
	
	public String getSound() {
        return "Cip-Cip";
    }
    
    public String getWhatEats() {
        return "cereals";
    }
    
    public String getSleep() {
        return "in the tree";
    }

    @Override
    public String getName() {
        return this.getClass().getName();
    }


}