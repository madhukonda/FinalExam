/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_9_Throws;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Madhu Babu Konda
 */
public class Throws {

    /**
     * @param args the command line arguments
     */
   
        public static void main(String[] args) throws InputMismatchException{
        // TODO code application logic here
         System.out.println("Answer for question 9: Madhu babu konda");
        Scanner s=new Scanner(System.in);
        try{
        System.out.print("Enter a integer value :");
        int n=s.nextInt();
        System.out.print("Enter a boolean value :");
        boolean d=s.nextBoolean();
        }
        catch(InputMismatchException ie){
            System.out.println(ie);
        }
        
    }
    
}
    
    

