package com.company;

class Employee3{
    private int id;
    private String name;

    public void setId(int i){
        this.id = i;
    }
    public int getId() {
        return id;
    }
    public void setName(String n) {
        this.name = n;
    }
    public String getName() {
        return name;
    }
}

public class ch9_AccessModifiers_and_Constructors {
    public static void main(String[] args) {
        Employee3 ac = new Employee3();
        ac.setName("ac");
        ac.setId(230);
        System.out.println(ac.getName());
        System.out.println(ac.getId());
    }
}