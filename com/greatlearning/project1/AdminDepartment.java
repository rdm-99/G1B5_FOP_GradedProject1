package com.greatlearning.project1;

public class AdminDepartment extends SuperDepartment {

    //declare method departmentName for admin
    public String departmentName() {
        return " Admin Department ";
    }

    //declare method getTodaysWork for admin
    public String getTodaysWork() {
        return "Complete your documents submission";
    }

    //declare method getWorkDeadline for admin
    public String getWorkDeadline() {
        return "Complete by EOD ";
    }
}
