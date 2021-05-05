/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_11;

/**
 *
 * @author Madhu Babu Konda
 */
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Volkswagen object1 = new Volkswagen(1000,"Jetta");
        Volkswagen object2 = new Volkswagen(1122,"Passat");
        Volkswagen object3 = new Volkswagen(1400,"Tiagun");
        Volkswagen object4 = new Volkswagen(1100,"Polo");
         Volkswagen object5 = new Volkswagen(1122,"Passat");
        /*
        * obj1 and obj4 have same brand names
        * hashcode method and equals method used to get the attributes for  brand name
        * For this attribute we can get hash code.
        */
        System.out.println("Answer for question 11: Madhu babu Konda");
        System.out.println("----- Hash Code ------");
        System.out.println(object1.hashCode()+ " : same the value for object4");
        System.out.println(object2.hashCode()+" : not the same value");
        System.out.println(object3.hashCode()+" : not the same value");
        System.out.println(object4.hashCode()+ " : same the value for object1");
        System.out.println(object5.hashCode()+ " :same the value of object2");
        /*
        * The same hash code returns for the same brandName attribute 
        */
        System.out.println("------ Equals -------");
        
        /*
        * Prints false because the brandName attribute was different for both the objects.
        */        
        System.out.println(object1.equals(object3));
        /*
        * Prints true because the brandName attribute was same for both the objects.
        */
        System.out.println(object1.equals(object4));
        /*
        * Prints flase because the brandName attribute was different for both the objects.
        */        
        System.out.println(object3.equals(object2));
        System.out.println(object5.equals(object2));
       
    }
    
    
}
    

