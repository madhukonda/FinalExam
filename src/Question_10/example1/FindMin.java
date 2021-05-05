/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_10.example1;

/**
 *
 * @author Madhu babu konda
 */
public class FindMin {

    static int[] numbers = {21, 32, 1, 2, 5, 6, 8, 9, 20};
    static int count = 0;
    static int min = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Answer for Question 10  : Madhu babu Konda ");
        System.out.print("Minimum number in the array is: ");
        System.out.println(findMin());
    }

    public static int findMin() {
        if (count == 0) {
            min = numbers[count];
        }
        if (min > numbers[count]) {
            min = numbers[count];
        }
        if (count == numbers.length - 1) {
            return min;
        } else {
            count++;
            return findMin();
        }
    }

}
