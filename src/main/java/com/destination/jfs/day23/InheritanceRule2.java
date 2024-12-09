
package com.destination.jfs.day23;

class Parent1 {
    // Constructor of Parent1 class
    public Parent1() {
        System.out.println("hi from Parent1");
    }
}

class Child1 extends Parent1 {
    // Constructor of Child1 class
    public Child1() {
        // Call to Parent1 constructor
        super();
        System.out.println("hi from Child1");
    }
}

public class InheritanceRule2 {
    public static void main(String[] args) {
        // Creating an instance of Child1 will trigger both parent and child constructors
        new Child1();
    }
}
