package com.derek;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("upper class code");

        try {
            System.out.println("unexceptional code");
            System.out.println("exceptional code is " + 100/0);
            System.out.println("more unexceptional code");
        } catch (ArithmeticException e) {
            System.out.println("arithmetic exception");
        } catch (Exception e) {
            System.out.println("generic exception");
        } finally {
            System.out.println("finally done");
        }

        System.out.println("bottom class code");

    }
}

