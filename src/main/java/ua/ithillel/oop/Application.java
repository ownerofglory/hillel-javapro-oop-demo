package ua.ithillel.oop;

import ua.ithillel.oop.address.Address;
import ua.ithillel.oop.person.*;
import ua.ithillel.oop.polymorph.SomeImplementation;
import ua.ithillel.oop.polymorph.SomeInterface;
import ua.ithillel.oop.school.ElementarySchool;
import ua.ithillel.oop.school.MiddleSchool;
import ua.ithillel.oop.school.School;
import ua.ithillel.oop.school.University;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {


        SomeInterface someInterface = new SomeImplementation();
        someInterface.someMethod(3);

        School elementarySchool = new ElementarySchool();
        School middleSchool = new MiddleSchool();
        School uni = new University(new ArrayList<>());

        Student studentIvan = new Student();
        studentIvan.setAge(18);
        studentIvan.setGpa(7.9);
        studentIvan.setContractType(ContractType.FREE);

        int number = ContractType.FREE.getNumber();
        ContractType[] values = ContractType.values();

        Person person = new Person("Ivan Petrenko", 18);
        Address address = new Address();
        address.setCity("Sample city");
        address.setNumber(21);
        address.setStreet("Sample Str");
        person.setAddress(address);

        List<Runner> runners = List.of(new Student(), new Person(), new Employee());
        for (Runner r :
                runners) {
            r.run(3000);
        }

        person.run(200);

        Person clone = person.clone();
        clone.print("name: %s; age: %d%n");

        System.out.println(clone);

        boolean equals1 = studentIvan.equals(person);


        Student studentPetro = new Student();
        studentIvan.setAge(17);
        studentIvan.setGpa(7.9);

        if (studentPetro == studentIvan) {
            System.out.println("Same students");
        }

        boolean equals = studentPetro.equals(studentIvan);



        uni.enroll(studentIvan);
        uni.createDepartment("Computer Science");

        Person.staticInt = 10;

        Employee john = new Employee("John", 28);
        Person personJohn = john;

        Person person1 = new Person("John Doe", 34);

        printObject(person1);
        printObject(john);
        personJohn.print();



//        Person person1 = new Person();
//        person1.name = "John Doe";
//        person1.setName("John Doe");
        // person1.age = -100;
//        person1.setAge(-100);

//        Person person2 = new Person();
        Person person2 = new Person("Jane Doe", 32);
        person2.print();
//        person2.name = "Jane Doe";
//        person2.setName("Jane Doe");


//        new Order() // no no
//        Order order = Order.builder()
//                .setName("Order 1")
//                .setDate(new Date())
//                .build();
//
//        Order order1 = Order.builder()
//                .setName("Order 2")
//                .setCost(1000)
//                .build();
//
//
//        SomeConnection connection = SomeConnection.getInstance();
//
//        SomeConnection connection1 = SomeConnection.getInstance();
//


    }

    private static void printObject(Object object) {
        if (object instanceof Person) {
            Person person = (Person) object;
            person.print();
        } else {
            System.out.println("Unknow object");
        }
    }
}
