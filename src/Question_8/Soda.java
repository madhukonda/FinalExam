/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_8;

/**
 *
 * @author Madhu Babu Konda
 */
public class Soda {
    private String Name;
    private int Price;

    public Soda(String Name) {
        this.Name = Name;
    }

    public void setPrice(int Price) {
        if (Price <= 0) {
            throw new ArithmeticException("soda price cannot be zero");
            
        }
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Soda{" + "Name=" + Name + ", Price=" + Price + '}';
    }
    
    
}
