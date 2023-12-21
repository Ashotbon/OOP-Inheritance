package pack6;

import pack1.WheeledTransportation;

public class Ferry extends WheeledTransportation {
    private static long ferrySerialCounter = 70000;
    private long ferrySerialNumber;
    private double maximumLoad;

    public Ferry() {
        super();
        this.maximumLoad = 2000;
        ferrySerialNumber = ferrySerialCounter++;
    }

    public Ferry(int numberOfWheels, double maximumSpeed, double maximumLoad) {
        super(numberOfWheels, maximumSpeed);
        this.maximumLoad = maximumLoad;
        ferrySerialNumber = ferrySerialCounter++;
    }

    public Ferry(Ferry other) {
        super(other);
        this.maximumLoad = other.maximumLoad;
        ferrySerialNumber = ferrySerialCounter++;
    }

    public long getNextFerrySerialNumber() {
        return ferrySerialNumber;
    }

    public String toString() {
        return String.format("This Ferry – serial #%d - has %d wheels, has a maximum speed of %.2f km/hr. Maximum load: %.2f tons",
                ferrySerialNumber, getNumberOfWheels(), getMaximumSpeed(), maximumLoad);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Ferry that = (Ferry) obj;

        return super.equals(obj) && Double.compare(that.maximumLoad, maximumLoad) == 0;
    }
}
