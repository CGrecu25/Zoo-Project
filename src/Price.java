
public abstract class Price {
	
	 public abstract double getPrice();
	}
	class DayPrice extends Price {
	    public double getPrice() {
	        return 8.5;
	    }
	}
	class NightPrice extends Price {
	    public double getPrice() {
	        return 10.5;
	    }
	}
	class WeekendPrice extends Price {
	    public double getPrice() {
	        return 11.5;
	    }
	}
	 
	class PriceFactory {
	    public enum PriceType {
	        Day, Night, Weekend
	    }
	    public static Price createPrice(PriceType priceType) {
	        switch (priceType) {
	            case Day:         return new DayPrice();
	            case Night:       return new NightPrice();
	            case Weekend:     return new WeekendPrice();
	        }
	        throw new IllegalArgumentException("The price " + priceType + " is not recognized.");
	    }

}

