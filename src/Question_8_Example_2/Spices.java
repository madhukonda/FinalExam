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
public class Spices {

    private String Name;
    private int Price;

    public Spices(String Name, int Price) {
        this.Name = Name;
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Spices{" + "Name=" + Name + ", Price=" + Price + '}';
    }

}
