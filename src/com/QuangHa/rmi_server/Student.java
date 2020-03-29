package com.QuangHa.rmi_server;


public class Student
{
    // Instance Variables
    String name;
    String id;
    String student_class;
    String phone_number;
    String email;
    String address;

    public Student(){}

    // Constructor Declaration of Class
    public Student(String name, String id, String student_class, String phone_number,String email, String address) {
        this.name = name;
        this.id = id;
        this.student_class = student_class;
        this.phone_number = phone_number;
        this.email = email;
        this.address = address;
    }

//    public String getStudentById(String id) {
//        int index = 0;
//
//        Student[] Student_Array = {
//                new Student("Bui Quang Ha", "17021237", "K62 Caclc2", "0696656569", "170212372@vnu.edu.vn" ,"Thai Binh" ),
//                new Student("Nguyen Quoc Cuong", "17021213", "K62 Caclc2", "0696656569","17021213@vnu.edu.vn " , "Gia Lai" ),
//                new Student("Pham Tuan Hiep", "17021242", "K62 Caclc2", "0696656569","17021242@vnu.edu.vn" , "Hai Duong" )};
//
//        for (int i = 0; i < Student_Array.length; i++) {
//            if (id == Student_Array[i].id) index = i;
//        }
//
//        return "Welcome " + Student_Array[index];
//    }

    public static void main(String[] args)
    {
        Student tuffy = new Student("tuffy","17021237", "K62", "09765653555", "17021237@vnu.edu.vn" , "Thai Binh");
        System.out.println(tuffy.name);
    }
}