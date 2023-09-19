package com.greatlearning.project1;

public class HrDepartment extends SuperDepartment {

    //declare method departmentName for hr
    public String departmentName() {
        return " Hr Department ";
    }

    //declare method getTodaysWork for hr
    public String getTodaysWork() {
        return "Fill today's timesheet and mark your attendance";
    }

    //declare method getWorkDeadline for hr
    public String getWorkDeadline() {
        return "Complete by EOD ";
    }

    //define method doActivity for hr
    public String doActivity() {
        return "team Lunch";
    }
}
