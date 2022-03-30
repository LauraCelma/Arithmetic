package com.company;

import java.util.Scanner;
import static java.lang.Math.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task1() {
        Scanner scanner = new Scanner(System.in);
        int intVar1 = 20, intVar2 = 10;
        short shortSum = (short) (intVar1 + intVar2);
        System.out.println("Summ is: " + shortSum);
        shortSum++;
        System.out.println("Increment is: " + shortSum);
        byte byteSum = (byte) (intVar1 + intVar2);
        System.out.println("byteSum: " + byteSum);
        System.out.println(++byteSum);
    }

    private static void task2() {
        Scanner scanner = new Scanner(System.in);
        float number = 13.43f;
        System.out.println("number:"+number);
        System.out.println("Please input a number");
        float number2 = scanner.nextFloat();
        System.out.println("Your number is: " + number2);

        double roundDown = Math.floor(number2);
        System.out.println("Rounded down to closest integer: " + roundDown);
        int rounded = Math.round(number2);
        System.out.println("Rounded according to math rules: " + rounded);
        double roundUp = Math.ceil(number2);
        System.out.println("Rounded up to the closest integer: " + roundUp);
    }
    private static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Values of 45 degree angle");
        System.out.println("Sin:" + (Math.sin(45)));
        System.out.println("cos:" + (Math.cos(45)));
        System.out.println("tan:" + (Math.tan(45)));
        System.out.println("asin:" + (Math.asin(45)));
        System.out.println("acos:" + (Math.acos(45)));
        System.out.println("atan:" + (Math.atan(45)));
    }
    private static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number");
        int number4 = scanner.nextInt();
        System.out.println("Your number: " + number4);
        System.out.println("1. Increment of your number: " + (++number4) + " and decrement is: " + (--number4));
        System.out.println("2. Bitwise complement operator: " + (~number4));
        System.out.println("Please input second number: ");
        int number4_1 = scanner.nextInt();
        System.out.println("3. Arithmetic operator: Number + SecondNumber = " + (number4 + number4_1));
        System.out.println("4. Relational operator: Number = SecondNumber ? " + (number4 == number4_1));
        System.out.println("5. Bitwise operator OR : = " + (number4 | number4_1));
        System.out.println("6. Conditional operator");
        String result =(number4==number4_1)? "Yes":"No";
        System.out.println("Result is: "+ result);
    }
    private static void task5() {
        int distance,hour,min,sec;
        Scanner scanner = new Scanner(System.in);
        // enter distance
        System.out.println("Please enter a distance in meters: ");
        distance = scanner.nextInt();
        float distance_km = (float) distance/1000;
        float distance_miles = (float) distance/1609;
        //enter time
        System.out.println("Please enter your time taken(hours): ");
        hour = scanner.nextInt();
        float hours_to_seconds =(float) hour*3600;
        //enter minutes
        System.out.println("Please enter your time taken(minutes): ");
        min = scanner.nextInt();
        float min_to_hours =(float) min/60;
        float min_to_seconds = (float) min*60;
        //enter seconds
        System.out.println("Please enter your time taken(seconds): ");
        sec = scanner.nextInt();
        float seconds_to_hours = (float) sec/3600;
        //calculations
        float m_s = (float) distance/(hours_to_seconds+min_to_seconds+sec);
        float km_h = distance_km/(hour+min_to_hours+seconds_to_hours);
        float miles_h = distance_miles/((hour+min_to_hours+seconds_to_hours));

        System.out.println("Your speed m/s is : "+ m_s);
        System.out.println("Your speed km/h is : "+km_h);
        System.out.println("Your speed miles/h is : "+miles_h);

    }

}
