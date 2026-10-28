
public interface IMovable {
    void move();

    default void describe() {
        System.out.println("Moving");
    }
}