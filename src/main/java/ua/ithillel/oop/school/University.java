package ua.ithillel.oop.school;

import ua.ithillel.oop.person.Student;

import java.util.List;

public class University extends School {
    public University(List<Student> studentList) {
        this.students = studentList;
    }

    @Override
    public void enroll(Student student) {
        System.out.println("Enrolling a student:  " + student);
        if (student.getAge() > 17 && student.getGpa() > 7.0) {
            students.add(student);
            return;
        }

        System.out.println("Unable to enroll the student: " + student);
    }
}
