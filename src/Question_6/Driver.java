/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Madhu Babu Konda
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        System.out.println("Answer for question 6: Madhu babu konda");
        System.out.println("we are trying to get a text file which is not"
                + " available at a location and we get a file not found exception");
   Scanner scan = new Scanner (new File("input.txt"));
   while(scan.hasNext()){
       String name = scan.next();
       double price = scan.nextDouble();
      Carpet driver = new Carpet("blue", 599);
   }
    }

}
