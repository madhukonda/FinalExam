/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_6;

/**
 *
 * @author Madhu Babu Konda
 */
public class Carpet {
    private String carpetColour;
    private int Price;

    public Carpet(String carpetColour, int Price) {
        this.carpetColour = carpetColour;
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "carpetColour=" + carpetColour + ", Price=" + Price ;
    }
    
    
}
