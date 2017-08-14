package il.co.electriccollege.inheritance.animals;

/**
 * Created by yaakov on 8/10/17.
 */
public class Dog extends Animal {


    public void motion() {

    }

    public void flavor() {

    }

    @Override
    public void makeNoise() {
        System.out.println("woof");
    }

    public int getVolume() {
        return 40;
    }


}
