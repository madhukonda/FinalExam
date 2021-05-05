/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_10.example2;

/**
 *
 * @author Madhu babu konda
 */
public class Location {

    private String locationName;
    private double magnitude;

    public Location(String locationName, double magnitude) {
        this.locationName = locationName;
        this.magnitude = magnitude;
    }

    public String getLocationName() {
        return locationName;
    }

    public double getMagnitude() {
        return magnitude;
    }

    @Override
    public String toString() {
        return "Location: " + "locationName=" + locationName
                + ", magnitude=" + magnitude;
    }

}
