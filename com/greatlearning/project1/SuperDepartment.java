package com.greatlearning.project1;

public class SuperDepartment {
    //This is the Super Class for all the other department classes

    //declare method for department name
    public String departmentName() {
        return " Super Department  ";
    }

    //declare method to get today's work update
    public String getTodaysWork() {
        return " No Work as of now ";
    }

    //declare method to get deadline for work
    public String getWorkDeadline() {
        return " Nil ";
    }

    //declare method to check if today is a holiday
    public String isTodayAHoliday() {
        return "Today is not a Holiday";
    }

}
