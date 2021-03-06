package com.example.interviewbookingapp.model;

public class Students {
    private int student_id;
    private String student_name;
    private String student_email;
    private String student_time;


    public Students() {
    }

    public Students(int student_id, String student_name, String student_email, String student_time) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_email = student_email;
        this.student_time = student_time;
    }

    public Students(int student_id, String student_name, String student_email) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_email = student_email;
    }

    public Students(String student_time) {
        this.student_time = student_time;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_email() {
        return student_email;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }

    public String getStudent_time() {
        return student_time;
    }

    public void setStudent_time(String student_time) {
        this.student_time = student_time;
    }
}
