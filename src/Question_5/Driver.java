/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_5;

/**
 *
 * @author Madhu Babu Konda
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ComparableCircle circle1 = new ComparableCircle(15.5);
        ComparableCircle circle2 = new ComparableCircle(18.3);
        System.out.println("Answer for question 5: Madhu babu konda");

        System.out.println("Area of Circle 1: " + circle1.calculateArea());
        System.out.println("Area of Circle 2: " + circle2.calculateArea());

        if (circle1.compareTo(circle2) == 0) {
            System.out.println("Both the circles have same area");
        } else if (circle1.compareTo(circle1) > 0) {
            System.out.println("Area of circle Circle1 is greater than Circle2");
        } else {
            System.out.println("Area of circle Circle2 is smaller than Circle1");
        }

    }

}
