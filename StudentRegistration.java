package Hafta_5.Haftalik_Teknik_İcerik_1.Student_Registration_System;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {

    public static void main(String[] args) {

        List<Student>students = new ArrayList<>();

        Student student = new Student("Burak", "Can","11556");
        Student student1 = new Student("Nisa", "Kalkan","12442");
        Student student2 = new Student("Emir", "Kurt","13007");
        Student student3 = new Student("Cihat", "Kansız","14006");
        Student student4 = new Student("Eda", "Sancak","15331");

        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for (Student allStudents : students){
            System.out.println(allStudents);

            System.out.println("");
            System.out.println("hashcode TEST");
            System.out.println(student.hashCode());
            System.out.println(student1.hashCode());
            System.out.println(student2.hashCode());
            System.out.println(student3.hashCode());
            System.out.println(student4.hashCode());

            System.out.println("");
            System.out.println("equals TEST");
            System.out.println(student.equals(student));
            System.out.println(student.equals(student1));
        }
    }
}
