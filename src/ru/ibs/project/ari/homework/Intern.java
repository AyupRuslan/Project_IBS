package ru.ibs.project.ari.homework;
import java.util.Random;
public class Intern extends Employees{
    String name_tutor;
    String project;
    String name_task;
    final String [] task ={"task1", "task2", "task3", "task4", "task5", "task6", "task7"};

    public Intern() {
    }
    public Intern(int ID, String name, double salary, String email, int grade, String name_tutor, String project) {
        super(ID, name, salary, email, grade);
        this.name_tutor = name_tutor;
        this.project = project;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getName_task() {
        return name_task;
    }

    public void setName_task(String name_task) {
        this.name_task = name_task;
    }

    public String getName_tutor() {
        return name_tutor;
    }

    public void setName_tutor(String name_tutor) {
        this.name_tutor = name_tutor;
    }
    public void Show(){
        System.out.println("ID = " + ID + " ,name = " + name + " ,salary = " + salary + ", email = " + email+
                " ,grade = " + grade + ", name_tutor = " +name_tutor + " ,name_project =" +project);
    }

    public void zadacha(){
        Random random =new Random();
        this.name_task = task[random.nextInt(7)];
        System.out.println("new zadacha = " + name_task);
    }

}
