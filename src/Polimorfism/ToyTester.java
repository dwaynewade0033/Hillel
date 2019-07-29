package Polimorfism;

import java.io.Serializable;
import java.util.Arrays;

public class ToyTester  implements Serializable, Cloneable {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Toy[] arrayToys = new Toy[6];
        Shape newShape = new Shape() {
            @Override
            public String toString() {
                return null;
            }
        };
        arrayToys[0] = Toy.toy_Creator(new Circle());
        arrayToys[1] = Toy.toy_Creator(new Circle());
        arrayToys[2] = Toy.toy_Creator(new Circle());
        arrayToys[3] = Toy.toy_Creator(new Square());
        arrayToys[4] = Toy.toy_Creator(new Square());
        arrayToys[5] = Toy.toy_Creator(new Square());
        arrayToys[5] = Toy.toy_Creator(newShape);

        for (int i = 0; i < arrayToys.length; i++) {
            if(arrayToys[i].getShape() instanceof Circle){
                System.out.println(arrayToys[i].toString());
            }

        }
        Arrays.toString(arrayToys);

        //Toy toy = Toy.toy_Creator(new Circle());


    }

}
