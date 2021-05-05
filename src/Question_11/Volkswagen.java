/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_11;

import java.util.Objects;

/**
 *
 * @author Madhu Babu Konda
 */
public class Volkswagen {
    private int noofSold;
    private String modelName;

 

    public Volkswagen(int ItemsSold, String BrandName) {
        this.noofSold = ItemsSold;
        this.modelName = BrandName;
    }

 

    
    public int getNoofSold() {
        return noofSold;
    }

 

    public void setNoofSold(int ItemsSold) {
        this.noofSold = ItemsSold;
    }

 

    public String getModelName() {
        return modelName;
    }

 

    public void setModelName(String oilName) {
        this.modelName = oilName;
    }

 

    @Override
    public String toString() {
        return "Total items sold : " + noofSold + ", modelName : " + modelName ;
    }

 

    /*
    *  For every object created in this class it returns hashcode.
    */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.modelName);
        return hash;
    }
    
    /*
    * Takes object as parameter which is used for comparing this class objects
    * if two objects have same values for metioned attributes  then hash code is equal.
    */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Volkswagen other = (Volkswagen) obj;
        if (!Objects.equals(this.modelName, other.modelName)) {
            return false;
        }
        return true;
    }
    
    


}
