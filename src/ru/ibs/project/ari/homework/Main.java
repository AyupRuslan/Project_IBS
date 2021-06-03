package ru.ibs.project.ari.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Создание анонимного экземпляра
        var ekz = new Employees(){
            int age;
            int staj;
            public int getAge() {
                return age;
            }
            public void setAge(int age) {
                this.age = age;
            }
            public int getSurname() {
                return staj;
            }
            public void setSurname(int staj) {
                this.staj = staj;
            }
            public void showDohod(double premia){
                System.out.println("Dohod = " + staj*12*(salary+premia));
            }
        };

        // создание списка объектов Employees
        Employees work1 = new Worker(101, "Petr", 22100.5, "work1@yah.ru",
                1, "design",7);
        Employees work2 = new Worker(102, "Dinar", 25350, "work2@yah.ru",
                2, "design",9);
        Employees inn1 = new Intern(111, "Ruslan", 12000, "inn1@yah.ru",
                0, "Ivan Petrovich", "web-application for A-Bank");
        Employees inn2 = new Intern(112, "Oleg", 12000, "inn2@yah.ru",
                0, "Oleg Vladimirovich", "web-site fo StroyCompany");
        Employees dev1 = new Developer(103, "Nikita", 35000,"dev1@mail.ru",4,
                "web-application for A-Bank", "develop", 22000);
        Employees dev2 = new Developer(104, "Danila", 39000,"dev2@mail.ru",5,
                "web-site fo StroyCompany", "develop", 15000);
        Employees dev3 = new Developer(105, "Alexandr", 44000,"dev3@mail.ru",6,
                "web-site fo StroyCompany", "develop", 19000);
        Employees dev4 = new Developer(106, "Dmitriy", 41000,"dev4@mail.ru",6,
                "web-site fo StroyCompany", "develop", 25400);
        Employees ch1 = new Chief(107, "Vladimir", 94500, "ch2@mail.ru",7, "web-application for A-Bank",
                33500,4);

        List<Employees> list1 = new ArrayList<>();
        list1.add(work1);
        list1.add(work2);
        list1.add(inn2);
        list1.add(inn1);
        list1.add(dev1);
        list1.add(dev2);
        list1.add(dev3);
        list1.add(dev4);
        list1.add(ch1);

        //Упражнения со Stream
        List<Employees>list2 =list1.stream().filter(element ->
                element.salary<40000 && element.name.length()<7 ).
                sorted((a,b) ->a.name.compareTo(b.name) ).collect(Collectors.toList());

        list2.forEach(e-> System.out.println(e));

        list2.stream().map(element -> {return element.name;}).forEach(e-> System.out.print(" " + e));

    }

}
