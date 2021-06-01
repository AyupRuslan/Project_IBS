package ru.ibs.project.ari.homework;
import java.util.Random;
public class Chief extends Employees implements Manager{
    String project;
    double bonus;
    int empoyees;
    final static String [] task = {"design", "develop the architecture","review","analisis","coding",
    "testing","build"};

    public Chief() {
    }
    public Chief(int ID, String name, double salary, String email,
                 int grade, String project, double bonus, int empoyees) {
        super(ID, name, salary, email, grade);
        this.project = project;
        this.bonus = bonus;
        this.empoyees = empoyees;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getEmpoyees() {
        return empoyees;
    }

    public void setEmpoyees(int empoyees) {
        this.empoyees = empoyees;
    }
    public String Task(){
        Random random =new Random();
        int num = random.nextInt(7);
        return task [num];
    }
    public void Show(){
        System.out.println("ID = " + ID + " ,name = " + name + " ,salary = " + salary +
                ", email = " + email+ " ,grade = " + grade+ " ,name_project = "+project+
                " ,employees = " + empoyees + " ,bonus = " +bonus);
    }
}
