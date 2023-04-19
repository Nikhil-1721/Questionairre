package com.Assignment;

class Person{
    int age;
    String name;
}
class Employee extends  Person{
    int id;
    int salary;
}
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.age = 21;
        emp.name = "Yash";
        emp.id = 104;
        emp.salary = 400000;

        System.out.println("Employee details :");
        System.out.println("Salary : " + emp.id);
        System.out.println("Name : " + emp.name);
        System.out.println("Age : " + emp.age);
        System.out.println("Salary : " + emp.salary);
    }
}
