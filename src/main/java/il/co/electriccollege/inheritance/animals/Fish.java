package il.co.electriccollege.inheritance.animals;

import il.co.electriccollege.inheritance.vehicles.Submergeable;

/**
 * Created by yaakov on 8/10/17.
 */
public class Fish extends Animal implements Submergeable {
    int bla=3;

    public void motion() {

    }

    public void flavor() {

    }

    public void makeNoise() {

    }

    public int getVolume() {
        return 0;
    }

    public void underWater() {

    }

    public boolean canGounderWater() {
        return false;
    }

//    String name;
//
//    public Fish(String name){
//
//        this.name = name;
//    }
//
////    public void motion() {
////
////    }
////
////    public void flavor() {
////
////    }
////
////    public void makeNoise() {
////
////    }
////
////    public int getVolume() {
////        return 0;
////    }
////
////    @Override
////    public boolean breathesAir() {
////        if(this.name.equals("lungfish")){
////            // a lungfish is treated as a regular animal
////            return super.breathesAir();
////        }
////        return false;
////    }
}
