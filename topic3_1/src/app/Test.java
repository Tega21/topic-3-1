// Brandon Ortega// CST-239// 11.05.2023// Code used from activity 2 example
package app;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Johnny", "Ortega", 11);
        Person person2 = new Person("Luke", "Ortega", 22);
        Person person3 = new Person(person1);

        // Testing object equality
//        if(person1 == person2){
//            System.out.println("Both person objects are identical using ==");
//        } else{
//            System.out.println("Persons are not identical using ==");
//        }
//
//        if(person1.equals(person2)){
//            System.out.println("Persons are identical using equals()");
//        } else{
//            System.out.println("These persons are not identical using equals()");
//        }
//        // Testing copy constructor
//        if(person1.equals(person3)){
//            System.out.println("Copied person is identical using equals()");
//        } else{
//            System.out.println("Copied person is not identical using equals()");
//        }

        // Output
        System.out.println(person1);
        System.out.println(person2.toString());
        System.out.println(person3);
        
        //Making person walk and run
        person1.walk();
        person1.run();
        System.out.println("Person 1 is running: " + person1.isRunning());
        person1.walk();
        System.out.println("Person 1 is running: " + person1.isRunning());
        
        // Creating an array of Persons and compare them so they are sorted by last names
        Person[] persons = new Person[4];
        persons[0] = new Person("Justine", "Reha", 17);
        persons[1] = new Person("Brianna", "Reha", 29);
        persons[2] = new Person("Mary", "Reha", 88);
        persons[3] = new Person("Alan", "Reha", 45);
        Arrays.sort(persons);
        for (int i = 0; i < 4; i++) {
        	System.out.println(persons[i]);
        }

    }
}
