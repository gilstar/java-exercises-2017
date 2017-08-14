package il.co.electriccollege.inheritance.vehicles;

public abstract class Vehicle {

    private String vehicleType;
    private int numberOfWheels;

    public abstract Integer getNumberOfWheels();


    public String getVehicleType() {
        return this.vehicleType;
    }

    public abstract void makeNoise();
}