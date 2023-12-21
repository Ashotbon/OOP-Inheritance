package pack1;

public class WheeledTransportation {
    private int numberOfWheels;
    private double maximumSpeed;
    private static long serialNumberCounter = 100;
    private long serialNumber;

    public WheeledTransportation() {
        numberOfWheels = 4;
        maximumSpeed = 100;
        serialNumber = serialNumberCounter++;
    }

    public WheeledTransportation(int numberOfWheels, double maximumSpeed) {
        this.numberOfWheels = numberOfWheels;
        this.maximumSpeed = maximumSpeed;
        serialNumber = serialNumberCounter++;
    }

    public WheeledTransportation(WheeledTransportation other) {
        this.numberOfWheels = other.numberOfWheels;
        this.maximumSpeed = other.maximumSpeed;
        this.serialNumber = getNextSerialNumber();
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    private long getNextSerialNumber() {
        return serialNumber++;
    }

    public String toString() {
        return String.format("This WheeledTransportation - serial #%d - has %d wheels and a maximum speed of %.2f km/hr.",
                getNextSerialNumber(), numberOfWheels, maximumSpeed);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        WheeledTransportation that = (WheeledTransportation) obj;

        return numberOfWheels == that.numberOfWheels &&
                Double.compare(that.maximumSpeed, maximumSpeed) == 0;
    }
}
