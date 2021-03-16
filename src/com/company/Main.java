package com.company;

abstract class Person{
    private String name;
    private int age;
    private String address;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person (String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public abstract void printInfo();
}
class Employee extends Person {
    private int salary;
    private String job;

    public Employee(String name, int age, String address, int salary, String job){
        super(name,age,address);
        this.salary=salary;
        this.job=job;
    }
    @Override
    public void printInfo(){
        System.out.println("Name: "+super.getName()+" , age: "+super.getAge()+" job: "+this.job+" salary: "+this.salary);
    }

    public int getSalary() {
        return this.salary;
    }
}
public class Main {

    public static void main(String[] args) {

        Employee empOne=new Employee("Mihaela", 30, "Cluj", 1500, "Developer");
        empOne.printInfo();
        Person person=new Employee("Cristina", 29, "Oradea", 2000, "Manager");
        System.out.println(person.getAddress());
        person.printInfo();
    }
}
