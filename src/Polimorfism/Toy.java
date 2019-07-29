package Polimorfism;

public class Toy {
    private final Shape shape;

    public Shape getShape() {
        return shape;
    }

    public Toy(Shape shape) {
        this.shape = shape;
    }

    public static Toy toy_Creator(Shape shape) {
        return new Toy(shape);

    }

    @Override
    public String toString() {
        return "Toy{" +
                "shape=" + shape.toString() +
                '}';
    }
}
