package ua.ithillel.oop.polymorph;

public interface SomeInterface {
    static int staticField = 1;

    void someMethod(int i);

    default void defaultMethod() {
        someMethod(4);
    }

    static void staticMethod() {

    }
}
