package com.identify.product.FamilyKart.practise.streamsapi;

public class Student {

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentName='" + StudentName + '\'' +
                ", StudentId=" + StudentId +
                ", city='" + city + '\'' +
                '}';
    }

    public String StudentName;
    public int StudentId;

    public String city;

    public Student(int studentId, String studentName, String city) {
        StudentName = studentName;
        StudentId = studentId;
        this.city = city;
    }

    public Student() {

    }


}
