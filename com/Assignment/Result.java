package com.Assignment;

public class Result extends Exam implements Sports{
    Student student = new Student();
    Exam exam = new Exam();


    @Override
    public void displayInfo() {
        student.setInfo(21, "Nikhil");
        int marks = exam.setMark(495);
        System.out.println(student.name);
        System.out.println(student.rollno);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Result result = new Result();
        System.out.println("Details of student :");
        result.displayInfo();
    }
}



