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
public class geometricobject {

    private String geometricobjectName;
    private int Sides;

    public geometricobject(String geometricObjectName, int noOfSides) {
        this.geometricobjectName = geometricObjectName;
        this.Sides = noOfSides;
    }

    public String getGeometricobjectName() {
        return geometricobjectName;
    }

    public int getSides() {
        return Sides;
    }
    
    @Override
    public String toString() {
        return "Geometric Object name was " + this.geometricobjectName
                + "\n "+ this.getGeometricobjectName() +" will not colorable";
    }

}

