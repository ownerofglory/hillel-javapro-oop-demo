package ua.ithillel.oop.person;

public interface Runner {
    void run(int distance);
    default void run() {
        run(1000);
    }
}
