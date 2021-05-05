/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Madhu Babu Konda
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> list = new ArrayList<>();
        System.out.println("Answer for question 12: Madhu babu Konda");

        list.add(new Employee(01, "ajay", 45000));
        list.add(new Employee(02, "venkat", 50000));
        list.add(new Employee(03, "madhu", 65000));
        list.add(new Employee(04, "babu", 60000));
        list.add(new Employee(05, "rishi", 47000));
       
        
        System.out.println("---------------original list---------------");
        for (Employee employee : list) {
            System.out.println(employee);
        }
        System.out.println("---------------sorted by on id---------------");
        Collections.sort(list);
        for (Employee employee : list) {
            System.out.println(employee);
        }

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee arg0, Employee arg1) {
                return Double.compare(arg0.getEmpSalary(), arg1.getEmpSalary());
            }
        });
        System.out.println("---------------sorted by salary---------------");
        for (Employee employee : list) {
            System.out.println(employee);
        }

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee arg0, Employee arg1) {
                return arg0.getEmpName().compareTo(arg1.getEmpName());
            }
        });
        System.out.println("---------------sorted based by name---------------");
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

}


    

