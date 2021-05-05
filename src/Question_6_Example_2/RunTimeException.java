/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_6_Example_2;

/**
 *
 * @author Madhu Babu Konda
 */
class Demo {

    private String name;

    public Demo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Demo{" + "name=" + name + '}';
    }

}

public class RunTimeException {

    public static void main(String[] args) {
        Demo d1 = null;
        System.out.println("Answer for question 6: Madhu babu konda");
        System.out.println("Here we are trying to access the toString of object"
                + "\nd1 which does not have an instance of Demo");
        d1.toString();

    }
}
