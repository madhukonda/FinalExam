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
public class Square extends geometricobject implements Colorable {

    private boolean colorable;
    private double length;

    public Square(boolean colorable, double length, String geometricObjectName, int noOfSides) {
        super(geometricObjectName, noOfSides);
        this.colorable = colorable;
        this.length = length;
    }

    public boolean isColorable() {
        return colorable;
    }

    public double getLength() {
        return length;
    }

    public double calcArea() {
        return Math.pow(length, 2);
    }

    @Override
    public void howToColor() {
        System.out.println("Color four sides");
    }

}

