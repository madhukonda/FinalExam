/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_3;

/**
 *
 * @author Madhu Babu Konda
 */
public class Narrowing_Casting {

    public static void main(String[] args) {
        System.out.println("Answer for Question 3 Narrowing Casting : Madhu babu Konda ");
        byte a = 4;

        short b = a;
        System.out.println(b);

        int c = b;
        System.out.println(c);

        float f = c;
        System.out.println(f);

        double d = f;
        System.out.println(d);

        f = (float) d;
        System.out.println(f);

        b = (short) c;
        System.out.println(b);

        a = (byte) b;
        System.out.println(a);

    }

}
