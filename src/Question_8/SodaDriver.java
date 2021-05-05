/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Madhu Babu Konda
 */
public class SodaDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InputMismatchException, ArithmeticException {
        // TODO code application logic here
System.out.println("Answer for question 8: Madhu babu konda");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name of soda : ");
        String name = scan.next();
        Soda soda = new Soda(name);
        System.out.print("Enter the price of soda: ");
        int price = scan.nextInt();
        soda.setPrice(price);
        System.out.println(soda);

        Soda soda1 = new Soda("Pepsi");
        System.out.println(soda1);
        soda1.setPrice(0);
        System.out.println(soda1);
    }

}
