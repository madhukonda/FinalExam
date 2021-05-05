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
public interface Course {

    int COURSE_CREDIT = 3;

    public abstract double getCourseLength();

    public default int weeklyClasses() {
        System.out.println("In interfacte");
        return 3;
    }

}
