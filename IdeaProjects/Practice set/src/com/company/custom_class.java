package com.company;

class Employee{
    int age;
    int salary;
    String name;

    public void printDetails(){
        System.out.println("My age is " + age + ", my name is " + name + " and my salary is $" + salary);
    }
    public int printSalary(){
        return salary;
    }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is my custom class!");
        Employee raja = new Employee(); // Instantiating a new Employee Object
        Employee ac = new Employee();

//         Setting Attributes for raja
        raja.age = 12;
        raja.name = "AP";
        raja.salary = 100000000;

//        Setting Attributes for raja
        ac.age = 12;
        ac.name = "AC";
        ac.salary = 50000000;

//         Printing the attributes
        raja.printDetails();
        ac.printDetails();
        System.out.println(
                raja.printSalary() + ac.printSalary());

//        System.out.println(raja.id);
//        System.out.println(raja.name);
    }
}
