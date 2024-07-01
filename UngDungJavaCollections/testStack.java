/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UngDungJavaCollections;

/**
 *
 * @author Admin
 */
// Java code to illustrate iterator() Method
// of Vector class
 
// Importing required classes
import java.util.*;
import java.util.Vector;
 
// Main class
public class testStack {
 
    // Main driver method
    public static void main(String args[])
    {
        // Creating an empty Vector of string type
        Stack<String> vector = new Stack<String>();
 
        // Adding elements into the Vector
        // using add() method
        vector.add("Welcome");
        vector.add("To");
        vector.add("Geeks");
        vector.add("4");
        vector.add("Geeks");
 
        // Printing and displaying the Vector
        System.out.println("Vector: " + vector);
 
        // Now creating an iterator
        Iterator value = vector.iterator();
 
        // Display message only
        System.out.println("The iterator values are: ");
 
        // Condition holds true till there is single element
        // remaining using hasNext() method
        while (value.hasNext()) {
 
            // Displaying the values
            // after iterating through the vector
            System.out.println(value.next());
        }
    }
}