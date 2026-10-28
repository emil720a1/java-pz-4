package Service;

public class PrefixGenerator implements NumberGenerator{
    private int number = 1;

    @Override
    public String generate() {
        return "USER-" + number++;
    }
}
