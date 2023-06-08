package com.company;

public class App {

    //we are adding static methods to this bc we're not instantiating

    public static int add (int x, int y) {
        return x + y;
    }

    public static int greaterValue (int x, int y) {
        if (x > y) {
            return x;
        }

        else {
            return y;
        }
    }

    //are datatypes are children of Object in Java
    public static void println (Object out) {

        System.out.println(out);
    }

    public static float add (float x, float y) {
        return x + y;
    }

    public static void printAll(Object... out) {
        //enhanced for loop
        for (Object o : out) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = add(a,b);
        println("a + b:");
        println(c); //sout then tab to automatically include this

        int greater = greaterValue(a, b);
        //System.out.println(greater);
        println("a > b:");
        println(greater);

        float x = 2.5f;
        float y = 7.5f;
        float z = add(x,y);

        println("x + y:");
        println(z);
        int [] arr = new int[] {1,2,4};
        printAll(c, z);
    }


}
