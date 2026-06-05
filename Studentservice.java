package service;
import model.Student;
import java.util.ArrayList;

public class Studentservice
{
    ArrayList<Student> students=new ArrayList<>();
    public void addStudent(Student s){
        students.add(s);
        System.out.println("students added");

    }
    public void viewStudents()
    {
        for(Student s:students)
        {
            s.display();
            System.out.println("-----------");
        }
    }
    public void searchStudent(int id)
    {
        boolean found = false;
        for(Student s:students)
            if(s.getId() == id)
            {
                s.display();
                found = true;
            }
        if(!found)
        {
            System.out.println("student not found");
        }
    }

}