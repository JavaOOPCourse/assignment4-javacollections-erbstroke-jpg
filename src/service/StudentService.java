package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        // TODO: Add at least 5 students
        students.add(new Student(77,"Belek",1.2));
        students.add(new Student(88,"Beleksus",1.9));
        students.add(new Student(99,"Bele",2.4));
        students.add(new Student(66,"Bel",3.1));
        students.add(new Student(55,"Belenwagen",2.1));
        System.out.println("5 students added");
    }

    public void removeLowGPA() {
        // TODO: Remove students with GPA < 2.0
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student s =iterator.next();
            if(s.getGpa()<2.0){
                iterator.remove();
            }
        }
        System.out.println("Students with GPA lower than 2 removed");
    }

    public void findHighestGPA() {
        // TODO: Find and print student with highest GPA
        if(students.isEmpty()){
            System.out.println("students is Empty");
        }
        Student best = students.get(0);

        for(Student s : students){
            if(s.getGpa()> best.getGpa()){
                best=s;
            }
        }
        System.out.println("Student with best GPA : "+best);

    }

    public void insertAtIndex() {
        // TODO: Insert new student at index 2
        students.add(2,new Student(33,"Erbol",3.6));
        System.out.println("New student added");
    }

    public void printStudents() {
        // TODO: Print using Iterator
        System.out.println("Students :");
        Iterator<Student> iterator=students.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}