package model;

public class Student {

    // TODO: declare fields
    private int id;
    private String name;
    private double gpa;

    // TODO: create constructor
    public Student(int id , String name, double gpa){
        this.id=id;
        this.name=name;
        this.gpa=gpa;
    }

    // TODO: create getters
    public int getId(){
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getGpa() {
        return this.gpa;
    }

    // TODO: override toString()
    public String toString(){
        return ("Name : "+this.name+" , id : "+this.id+" , GPA : "+this.gpa);
    }

}