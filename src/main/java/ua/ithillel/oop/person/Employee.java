package ua.ithillel.oop.person;

public class Employee extends Person {
    private String job;

    public Employee() {
    }

    public Employee(String name, int age) {
        super(name, age);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void print() {
        System.out.printf("name=%s; age=%d; job=%s%n", name, age, job);
    }

}
