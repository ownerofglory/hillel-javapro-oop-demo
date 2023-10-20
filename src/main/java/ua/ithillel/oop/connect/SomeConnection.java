package ua.ithillel.oop.connect;

public class SomeConnection {
    private static SomeConnection INSTANCE;

    private SomeConnection() {}

    public static SomeConnection getInstance() {

        // lazy init
        if (INSTANCE == null) {
            INSTANCE = new SomeConnection();
        }

        return INSTANCE;
    }
}
