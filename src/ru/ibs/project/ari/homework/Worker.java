package ru.ibs.project.ari.homework;

public class Worker extends Employees{
    String name_task;
    int tasks;

    public Worker() {
    }
    public Worker(int ID, String name, double salary, String email, int grade, String name_task, int tasks) {
        super(ID, name, salary, email, grade);
        this.name_task = name_task;
        this.tasks =tasks;
    }

    public int getTasks() {
        return tasks;
    }

    public void setTasks(int tasks) {
        this.tasks = tasks;
    }

    public String getName_task() {
        return name_task;
    }

    public void setName_task(String name_task) {
        this.name_task = name_task;
    }
    public void Show(){
        System.out.println("ID = " + ID + " ,name = " + name + " ,salary = " + salary +
                ", email = " + email+ " ,grade = " + grade + ", task = " + name_task);
    }
    public int VolumeWork(int closes_tasks) {
        if (closes_tasks <= this.tasks) {
            this.tasks-=closes_tasks;
            System.out.println("Kolichestvo ostavshihsya zadach = " + this.tasks);
        } else {
            System.out.println("nevernoe kolichestvo zadach");
        }
        return this.tasks;
    }
    public void UpperWork(){
        this.tasks++;
    }
    public void LowerWork(){
        this.tasks--;
    }
}
