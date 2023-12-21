package pack4;

import pack1.WheeledTransportation;

public class Monowheel extends WheeledTransportation {
    private static long monowheelSerialCounter = 55000;
    private long monowheelSerialNumber;
    private double maximumWeight;

    public Monowheel() {
        super();
        this.maximumWeight = 500;
        monowheelSerialNumber = monowheelSerialCounter++;
    }

    public Monowheel(int numberOfWheels, double maximumSpeed, double maximumWeight) {
        super(numberOfWheels, maximumSpeed);
        this.maximumWeight = maximumWeight;
        monowheelSerialNumber = monowheelSerialCounter++;
    }

    public Monowheel(Monowheel other) {
        super(other);
        this.maximumWeight = other.maximumWeight;
        monowheelSerialNumber = monowheelSerialCounter++;
    }

    public long getNextMonowheelSerialNumber() {
        return monowheelSerialNumber;
    }

    @Override
    public String toString() {
        return String.format("This Monowheel – serial #%d - has %d wheels, has a maximum speed of %.2f km/hr. Maximum weight: %.2f kg",
                monowheelSerialNumber, getNumberOfWheels(), getMaximumSpeed(), maximumWeight);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Monowheel that = (Monowheel) obj;

        return super.equals(obj) && Double.compare(that.maximumWeight, maximumWeight) == 0;
    }
}
