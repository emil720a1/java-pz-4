package Service;

public class SequentialGenerator implements NumberGenerator {
    private int number = 1;

    @Override
    public String generate() {
        return String.valueOf(number++);
    }
}