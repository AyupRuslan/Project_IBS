package ru.ibs.project.ari.homework;

public abstract class Employees {
    int ID;
    String name;
    double salary;
    String email;
    int grade;

    public Employees() {
    }

    public Employees(int ID, String name, double salary, String email, int grade) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
        this.email = email;
        this.grade = grade;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", grade=" + grade +
                '}';
    }

    public void Show(){
        System.out.println("ID = " + ID + " ,name = " + name + " ,salary = " + salary + ", email = " + email+
                " ,grade = " + grade);
    }

}
