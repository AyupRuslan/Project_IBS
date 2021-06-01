package ru.ibs.project.ari.homework;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Worker work1 = new Worker(101, "Petr", 22100.5, "work1@yah.ru",
                1, "design",7);
        Worker work2 = new Worker(102, "Dinar", 25350, "work2@yah.ru",
                2, "design",9);
        Intern inn1 = new Intern(111, "Ruslan", 12000, "inn1@yah.ru",
                0, "Ivan Petrovich", "web-application for A-Bank");
        Intern inn2 = new Intern(112, "Oleg", 12000, "inn2@yah.ru",
                0, "Oleg Vladimirovich", "web-site fo StroyCompany");
        Developer dev1 = new Developer(103, "Nikita", 35000,"dev1@mail.ru",4,
                "web-application for A-Bank", "develop", 22000);
        Developer dev2 = new Developer(104, "Danila", 39000,"dev2@mail.ru",5,
                "web-site fo StroyCompany", "develop", 25000);
        Chief ch1 = new Chief(105, "Vladimir", 94500, "ch2@mail.ru",6, "web-application for A-Bank",
                33500,4);

        HashSet <Employees> set = new HashSet<>();
        set.add(work1);
        set.add(inn1);
        set.add(dev1);
        set.add(ch1);

        ArrayList <Employees> list = new ArrayList<>(set);

        for (Employees emp: list){
            emp.Show();
        }
    }

}
