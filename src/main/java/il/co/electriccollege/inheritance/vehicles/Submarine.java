package il.co.electriccollege.inheritance.vehicles;

import il.co.electriccollege.inheritance.faces.Submergeable;

public class Submarine extends Vehicle implements Submergeable {

    private String name;

    public Submarine(String name) {
        this.name = name;
    }

    public Integer getNumberOfWheels() {
        return 0;
    }

    @Override
    public String toString() {
        return "Submarine{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void makeNoise() {
        System.out.println("whashh");
    }

    public void howItMove() {
        System.out.println("use Engin");
    }
}
