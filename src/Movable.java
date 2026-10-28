
public interface Movable {

    void move();

    default void describe() {
        System.out.println("Moving");
    }
}