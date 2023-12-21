
package pack2;
import pack3.Metro;

public class Tram extends Metro {
    private  long tramSerialCounter = 30000;
    private  long tramSerialNumber;
    private int yearOfCreation;

    // Default Constructor
    public Tram() {
        super();
        System.out.println("this is from Tram");
        this.yearOfCreation = 0;
        tramSerialNumber= tramSerialCounter++;
    }

    // Parameterized Constructor
    public Tram(int numberOfWheels, double maximumSpeed, int numberOfVehicles,
                String startingStation, String destinationStation, int totalStops, int yearOfCreation) {
        super(numberOfWheels, maximumSpeed, numberOfVehicles, startingStation, destinationStation, totalStops);
        this.yearOfCreation = yearOfCreation;
        tramSerialNumber= tramSerialCounter++;
        System.out.println("this is from Tram");
    }
    
	// Copy Constructor
    public Tram(Tram other) {
        super();
        this.yearOfCreation = other.yearOfCreation;
        tramSerialNumber= tramSerialCounter++;
    }
    

    public long getTramSerialNumber() {
		return tramSerialNumber;
	}

	public void setTramSerialNumber(long tramSerialNumber) {
		this.tramSerialNumber = tramSerialNumber;
	}

	public int getYearOfCreation() {
		return yearOfCreation;
	}

	public void setYearOfCreation(int yearOfCreation) {
		this.yearOfCreation = yearOfCreation;
	}
	public String toString() {
	        return String.format("This Tram – serial #%d - has %d wheels, has a maximum speed of %.2f km/hr.",
	                tramSerialNumber, getNumberOfWheels(), getMaximumSpeed());
	    }
	
    public boolean isEqual(Tram other) {
        // Check if the objects are the same reference
        if (this == other) return true;

        // Call the parent class's isEqual method
        if (!super.isEqual(other)) return false;

        // Check if the values of Tram-specific attributes are equal
        if (other instanceof Tram) {
            Tram otherTram = (Tram) other;
            return yearOfCreation == otherTram.yearOfCreation;
        }
		return false;
    }


}
