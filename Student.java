package model;

public class Student {

    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {

        this.id = id;
        this.name = name;
        this.marks = marks;
    }


    public int getId() {

        return id;
    }

    public void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}