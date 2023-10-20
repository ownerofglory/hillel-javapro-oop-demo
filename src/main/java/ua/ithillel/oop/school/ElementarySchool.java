package ua.ithillel.oop.school;

import ua.ithillel.oop.person.Student;

public class ElementarySchool extends School {

    public void enroll(Student student) {
        System.out.println("Enrolling a student:  " + student);
        students.add(student);
    }
}
