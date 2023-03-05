package lv.acodemy.homework;

import org.w3c.dom.ls.LSOutput;

public class FirstHomeWork {
    public static void main(String[] args) {
        // Create 2 variable for each data type (meaningful)

        byte numberOfKids = 33;
        System.out.println(numberOfKids);

        byte oakAge = 100;
        System.out.println(oakAge);

        short numberOfBuildings = 2000;
        System.out.println(numberOfBuildings);

        short yearOfProduction = 1955;
        System.out.println(yearOfProduction);

        int numberOfRow = 2;
        System.out.println(numberOfRow);

        int luckyNumber = 5;
        System.out.println(luckyNumber);

        long kmRoad = 20000;
        System.out.println(kmRoad);

        long numberOfCv = 123456;
        System.out.println(numberOfCv);

        float distanceTime = 33.4f;
        System.out.println(distanceTime);

        float sunsetTime = 06.30f;
        System.out.println(sunsetTime);

        double packageWeight = 900.50;
        System.out.println(packageWeight + " gr ");

        double mountainHeight = 12345.44;
        System.out.println(mountainHeight);

        boolean isWarmOutside = false;
        boolean isColdOutside = true;
        boolean isFirstApril = false;
        boolean isFifthMarch = true;

        char myHobby ='S';
        System.out.println(myHobby);

        char yourNumber = 4;
        System.out.println(yourNumber);

        // Concatenation (write about myself)

        String firstName = "Marina";
        String lastName = "Čelika";
        String livingPlace = "Riga";
        System.out.println("Hi! My name is " + firstName+ " " + lastName + " and I live in " + livingPlace + ".");

        // Play with arithmetic operators (+, -, / .. )

        int x = 5;
        int y = 6;
        int c = 7;
        int d = (x + y)-c;
        System.out.println(d);

        int firstNumber = 5 % 5;
        int secondNumber = 10 / 2;
        int thirdNumber = firstNumber +secondNumber;
        System.out.println(thirdNumber);

        int a = 2*3;
        int b = 3*5;
        int e = (a+b)-b;
        System.out.println(e);
    }
}