package pack2;

import pack1.WheeledTransportation;

public class Train extends WheeledTransportation {
    private static long trainSerialCounter = 10000;
    private long trainSerialNumber;
    private int numberOfVehicles;
    private String startingStation;
    private String destinationStation;

    public Train() {
        super();
        this.numberOfVehicles = 20;
        this.startingStation = "McGill";
        this.destinationStation = "Edmonton";
        trainSerialNumber = trainSerialCounter++;
    }

    public Train(int numberOfWheels, double maximumSpeed, int numberOfVehicles, String startingStation, String destinationStation) {
        super(numberOfWheels, maximumSpeed);
        this.numberOfVehicles = numberOfVehicles;
        this.startingStation = startingStation;
        this.destinationStation = destinationStation;
        trainSerialNumber = trainSerialCounter++;
    }

    public Train(Train other) {
        super(other);
        this.numberOfVehicles = other.numberOfVehicles;
        this.startingStation = other.startingStation;
        this.destinationStation = other.destinationStation;
        trainSerialNumber = trainSerialCounter++;
    }

    public long getNextTrainSerialNumber() {
        return trainSerialNumber;
    }
    
    public long getNumberOfVehicles(){
        return numberOfVehicles;
    }
    
    public String getStartingStation(){
        return startingStation;
    }
    
    public String getDestinationStation(){
        return destinationStation;
    }

    @Override
    public String toString() {
        return String.format("This Train – serial #%d - has %d wheels, has a maximum speed of %.2f km/hr. It has %d vehicles and its starting and destination stations are %s and %s.",
                trainSerialNumber, getNumberOfWheels(), getMaximumSpeed(), numberOfVehicles, startingStation, destinationStation);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Train that = (Train) obj;

        return super.getNumberOfWheels() == that.getNumberOfWheels() &&
                Double.compare(super.getMaximumSpeed(), that.getMaximumSpeed()) == 0 &&
                numberOfVehicles == that.numberOfVehicles &&
                startingStation.equals(that.startingStation) &&
                destinationStation.equals(that.destinationStation);
    }
}
