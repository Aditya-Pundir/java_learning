package com.company;

class Employee4{
    private String name;
    private int id;

    public Employee4(){
        id = 0;
        name = "Undefined";
    }
    public Employee4(String myName, int myId){
        id = myId;
        name = myName;
    }

    public String getName() {return name;}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
}
public class Constructors {
    public static void main(String[] args) {
        Employee4 ab = new Employee4();
        Employee4 ac = new Employee4("AC", 12691);
        System.out.println("The name of ac is " + ac.getName());
        System.out.println("The id of ac is " + ac.getId());
        System.out.println();
        System.out.println("The name of ab is " + ab.getName());
        System.out.println("The id of ab is " + ab.getId());
    }
}
