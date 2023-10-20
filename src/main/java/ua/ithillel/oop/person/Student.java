package ua.ithillel.oop.person;

//public record Student(String name) {
//}

import java.util.Objects;

public class Student extends Person {
    private double gpa;
    private ContractType contractType;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }

        if (object instanceof Person) {
            Person student = (Student) object;

            if (student.age == this.age && student.getName().equals(this.name)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gpa);
    }

    @Override
    public void run(int distance) {
        System.out.println(name + " student running: " + distance);
        if (distance > 1000) {
            System.out.println("Need a break");
        }
        System.out.println("Keep on running");
    }
}
