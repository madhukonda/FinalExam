/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_10.example2;

import java.util.ArrayList;

/**
 *
 * @author Madhu babu konda
 */
public class LocationDriver {

    public static ArrayList<Location> locations = new ArrayList<>();
    public static int count = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Answer for Question 10  : Madhu babu Konda ");
        locations.add(new Location("Hyderabad", 1234.56));
        locations.add(new Location("Bangalore", 5432.56));
        locations.add(new Location("Belagavi", 78354.56));
        locations.add(new Location("Gulbarga", 75643.56));
        locations.add(new Location("Delhi", 463643.56));
        locations.add(new Location("Mumbai", 5343.56));

        System.out.println(searchLocation("Delhi"));
    }

    public static String searchLocation(String lName) {

        if (locations.get(count).getLocationName().equalsIgnoreCase(lName)) {
            return locations.get(count).toString();
        } else {
            if (count == locations.size() - 1) {
                return "Location not found";
            }
            count++;
            return searchLocation(lName);
        }
    }

}
