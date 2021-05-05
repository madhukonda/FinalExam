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
public class GroundFloor extends Floor {

    public GroundFloor(double floorLength, double floorBreadth, int noOfRooms) {
        super(floorLength, floorBreadth, noOfRooms);
    }

    @Override
    public double getFloorArea() {
        return super.getFloorBreadth() * super.getFloorBreadth();
    }

    @Override
    public String toString() {
        return "GroundFloor:" + "\nFloor Length:" + super.getFloorLength()
                + "\nFloor Breadth: " + super.getFloorBreadth() + "\nNo of rooms: "
                + super.getNoOfRooms() + "\nFloor Area: " +getFloorArea();
    }

}
