package pack3;

import pack2.Train;
import pack2.Tram;

public class Metro extends Train {
    private static long metroSerialCounter = 25000;
    private long metroSerialNumber;
    private int totalStops;

    public Metro() {
        super();
        this.totalStops = 15;
        metroSerialNumber = metroSerialCounter++;
    }

    public Metro(int numberOfWheels, double maximumSpeed, int numberOfVehicles,
                 String startingStation, String destinationStation, int totalStops) {
        super(numberOfWheels, maximumSpeed, numberOfVehicles, startingStation, destinationStation);
        this.totalStops = totalStops;
        metroSerialNumber = metroSerialCounter++;
    }

    public Metro(Metro other) {
        super(other);
        this.totalStops = other.totalStops;
        metroSerialNumber = metroSerialCounter++;
    }

    public long getNextMetroSerialNumber() {
        return metroSerialNumber;
    }

    @Override
    public String toString() {
        return String.format("This Metro – serial #%d - has %d wheels, has a maximum speed of %.2f km/hr. It has %d vehicles, its starting and destination stations are %s and %s. Total stops: %d",
                metroSerialNumber, getNumberOfWheels(), getMaximumSpeed(), getNumberOfVehicles(), getStartingStation(), getDestinationStation(), totalStops);
    }

    @Override
    public boolean equals(Object obj) {
//    	 System.out.println("Hello");
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Metro that = (Metro) obj;
        boolean i= totalStops == that.totalStops;
        
//        System.out.println("Hello"+i );

        return super.equals(obj) && totalStops == that.totalStops;
    }

	public boolean isEqual(Tram other) {
		// TODO Auto-generated method stub
		return false;
	}
}
