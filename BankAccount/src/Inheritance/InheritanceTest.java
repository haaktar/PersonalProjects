package Inheritance;

import Overriding.AccessModifiers;

public class InheritanceTest extends AccessModifiers {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.protectedData); // visible in the same packacge and child class
    }
}
