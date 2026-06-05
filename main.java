package main;

import model.Student;
import service.Studentservice;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Studentservice service = new Studentservice();

        Student s1 = new Student(101, "Rahul", 95);
        Student s2 = new Student(102, "Sai", 88);

        service.addStudent(s1);
        service.addStudent(s2);

        System.out.println("\nAll Students:");

        service.viewStudents();

        System.out.println("\nSearch Student:");

        service.searchStudent(101);
    }
}