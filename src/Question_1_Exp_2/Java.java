/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_1_Exp_2;

/**
 *
 * @author Madhu Babu Konda
 */
public class Java implements Course {

    private String courseName;

    public Java(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public double getCourseLength() {
        System.out.println("In class course");
        return 5;
    }

    @Override
    public String toString() {
        return "Java: " + "\nCourseName=" + courseName
                + "\nCourse Length in months: "
                + getCourseLength()
                +"\nWeekly Classes: "
                + Course.super.weeklyClasses()
                + "\nCredit: " + Course.COURSE_CREDIT;
    }

}
