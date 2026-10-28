import Service.GeneratorService;
import Service.SequentialGenerator;
import Service.PrefixGenerator;

public class Main {
    public static void main(String[] args) {
        // new Animal() {}; // Error: We can't create abstract class 

        Bird bird = new Bird();

        Movable movable = bird;
        Feedable feedable = bird;

        movable.move();
        movable.describe();

        feedable.feed();
        feedable.describe();

        Animal fish = new Fish();
        

        bird.animalSound();
        bird.sleep();


        fish.animalSound();
        fish.sleep();

        GeneratorService sequentialService =
                new GeneratorService(new SequentialGenerator());

        GeneratorService prefixService =
                new GeneratorService(new PrefixGenerator());
            
        sequentialService.printNumber();
        sequentialService.printNumber();

        prefixService.printNumber();
        prefixService.printNumber();
    }
}
