package MultiThreading;

public class SimpleIncrementor extends Thread {
    private final Generator generator;

    public SimpleIncrementor(Generator generator) {
        this.generator = generator;
    }

    @Override
    public void run() {

        generator.increment();
    }
}
