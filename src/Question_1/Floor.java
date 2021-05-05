/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_1;

/**
 *
 * @author Madhu Babu Konda
 */
public abstract class Floor {

    private double floorLength;
    private double floorBreadth;
    private int noOfRooms;

    public double getFloorLength() {
        return floorLength;
    }

    public double getFloorBreadth() {
        return floorBreadth;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public Floor(double floorLength, double floorBreadth, int noOfRooms) {
        this.floorLength = floorLength;
        this.floorBreadth = floorBreadth;
        this.noOfRooms = noOfRooms;
    }

    public abstract double getFloorArea();
}
