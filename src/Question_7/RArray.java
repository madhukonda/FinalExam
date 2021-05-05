/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Madhu Babu Konda
 */
public class RArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numbers[] = new int[100];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println("Answer by Madhu babu Konda : Question7");

        System.out.print("Enter index to find integer : ");
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        try {
            System.out.println("Integer at index " + index + " is "
                    + numbers[index]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
