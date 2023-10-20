package ua.ithillel.oop.polymorph;

public class SomeImplementation implements SomeInterface {
    @Override
    public void someMethod(int i) {
        System.out.println("Called with: " + i);
    }
}
