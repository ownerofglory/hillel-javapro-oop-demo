package ua.ithillel.oop.school;

import ua.ithillel.oop.person.Student;

import java.util.ArrayList;
import java.util.List;

public abstract class School {
    protected List<Student> students = new ArrayList<>();
    protected List<Department> departments = new ArrayList<>();

    // for aggregation
    public abstract void enroll(Student student);

    // for composition
    public void createDepartment(String name) {
        Department department = new Department(name);

        departments.add(department);
    }
}
