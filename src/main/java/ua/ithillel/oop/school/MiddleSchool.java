package ua.ithillel.oop.school;

import ua.ithillel.oop.person.Person;
import ua.ithillel.oop.person.Student;

public class MiddleSchool extends School {
    @Override
    public void enroll(Student student) {
        System.out.println("Enrolling a student:  " + student);
        if (student.getGpa() > 5.0) {
            students.add(student);
            return;
        }

        System.out.println("Unable to enroll the student: " + student);
    }
}
