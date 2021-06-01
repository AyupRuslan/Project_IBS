package ru.ibs.project.ari.homework;

public class Developer extends Employees{
    String project;
    String task;
    double bonus;

    public Developer() {
    }
    public Developer(int ID, String name, double salary, String email,
                     int grade, String project, String task, double bonus) {
        super(ID, name, salary, email, grade);
        this.project = project;
        this.task = task;
        this.bonus = bonus;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void zadacha(){
        Chief ch =new Chief();
        this.task =ch.Task();
        System.out.println("new zadacha = " + task);
    }
    public void Show(){
        System.out.println("ID = " + ID + " ,name = " + name + " ,salary = " + salary +
                ", email = " + email+ " ,grade = " + grade + " , name_project = " +project+
                ", bonus = " + bonus);
    }
}
