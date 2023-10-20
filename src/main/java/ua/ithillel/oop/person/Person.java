package ua.ithillel.oop.person;

import ua.ithillel.oop.address.Address;

import java.util.Objects;

// public, protected, "package-protected", private
public class Person implements Cloneable, Runner {
    protected final String name;
    protected int age;

    protected Address address;



    static {
        System.out.println("Person's static block");
        staticInt = 20;
    }
    public static int staticInt = 10;

    static  {
        System.out.println("Other static block");
    }

    {

        System.out.println("Person's dynamic block");
//        name = "Default";
    }

    public Person() {
        this.name = "Default";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException();
        }
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static int getStaticInt() {
        return staticInt;
    }

    public static void setStaticInt(int staticInt) {
        Person.staticInt = staticInt;
    }

    private String format(String name, int age) {
        return String.format("name=%s;age=%d%n", name, age);
    }

    public void print() {
        String result = format(name, age);
        System.out.printf(result);
    }

    public void print(String s) {
        System.out.printf(s, name, age);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || !(object instanceof Person)) return false;
        Person person = (Person) object;
        return age == person.age && Objects.equals(name, person.name);
    }

    //    @Override
//    public boolean equals(Object object) {
//        if (object == null) {
//            return false;
//        }
//        if (object == this) {
//            return true;
//        }
//
//        if (object instanceof Person) {
//            Person person = (Person) object;
//
//            if (person.age == this.age && person.getName().equals(this.name)) {
//                return true;
//            }
//        }
//
//        return false;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public Person clone() {
        Person copy = new Person(name, age);
        copy.setAddress(address.clone());
        return copy;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void run(int distance) {
        System.out.println( name + " Running: " + distance + " m");
    }
}
