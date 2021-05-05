/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_8_Example_2;

/**
 *
 * @author Madhu Babu Konda
 */
public class SpiceDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 8: Madhu babu konda");
        Spices spice = new Spices("Cardammom", 20);
        System.out.println(spice);

        Spices spice1 = null;
        try {
            spice1.toString();
        } catch (NullPointerException ne) {
            System.out.println("Reference cannot be null");
        }
    }

}
