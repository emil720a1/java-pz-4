
public interface Feedable {
    void feed();

    default void describe() {
        System.out.println("Feeding");
    }
}
