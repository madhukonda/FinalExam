/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_2;

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
         System.out.println("Answer for Question 2  : Madhu babu Konda ");
        geometricobject[] geoArray = new geometricobject[5];

        Square gObj1 = new Square(true, 2, "Square_1", 3);
        geometricobject gObj2 = new Square(false, 4, "Square_2", 5);
        geometricobject gObj3 = new Square(true, 7, "Square_3", 5);
        geometricobject gObj4 = new Square(false, 9, "Square_4", 5);
        geometricobject gObj5 = new Square(true, 12, "Square_5", 5);

        geoArray[0] = gObj1;
        geoArray[1] = gObj2;
        geoArray[2] = gObj3;
        geoArray[3] = gObj4;
        geoArray[4] = gObj5;

        for (geometricobject go : geoArray) {
            Square s = (Square) (go);
            if (s.isColorable()) {
                s.howToColor();
                System.out.println("The Area of " + s.getGeometricobjectName() + " is "
                        + Math.round(s.calcArea() * 100) / 100.0);
            } else {
                System.out.println(go);

            }
        }

    }

}
