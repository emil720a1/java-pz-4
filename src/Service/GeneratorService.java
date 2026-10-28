package Service;

public class GeneratorService {
    private final NumberGenerator generator;

    public GeneratorService(NumberGenerator generator) {
        this.generator = generator;
    }

    public void printNumber() {
        System.out.println(generator.generate());
    }
}
