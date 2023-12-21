package pack5;

public class Aircraft {
    private double price;
    private double maximumElevation;
    private static long aircraftSerialCounter = 80000;
    private long aircraftSerialNumber;

    public Aircraft() {
        this.price = 1000000;
        this.maximumElevation = 10000;
        aircraftSerialNumber = aircraftSerialCounter++;
    }

    public Aircraft(double price, double maximumElevation) {
        this.price = price;
        this.maximumElevation = maximumElevation;
        aircraftSerialNumber = aircraftSerialCounter++;
    }

    public Aircraft(Aircraft other) {
        this.price = other.price;
        this.maximumElevation = other.maximumElevation;
        this.aircraftSerialNumber = getNextAircraftSerialNumber();
    }

    public long getNextAircraftSerialNumber() {
        return aircraftSerialNumber;
    }
    public long getPrice() {
        return (long) price;
    }

    public String toString() {
        return String.format("This Aircraft – serial #%d - has a price of %.2f USD and a maximum elevation of %.2f meters.",
                getNextAircraftSerialNumber(), price, maximumElevation);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Aircraft that = (Aircraft) obj;

        return Double.compare(that.price, price) == 0 &&
                Double.compare(that.maximumElevation, maximumElevation) == 0;
    }
}
