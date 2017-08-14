package il.co.electriccollege.inheritance.vehicles;

import il.co.electriccollege.inheritance.animals.Fish;
import il.co.electriccollege.inheritance.faces.Submergeable;

import java.util.ArrayList;

public class Test {

    public static void main(String[]args){

        Car aaa=new Car("car");
        ArrayList<Submergeable> movments = new ArrayList<Submergeable >();
        movments.add(new Fish());
        movments.add(new Submarine("Yellow submarine"));

        for(Submergeable n: movments){
            n.howItMove();
            System.out.println(n);
        }
    }

}
