package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double hoursSleep;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter hours of sleep: " );
        hoursSleep=  scnr.nextDouble();

        if (hoursSleep < 5){
            System.out.print("Go take a a nap!");
        }
        else if (hoursSleep == 10){
            System.out.println("Wow! the perfect amount of sleep :)");
        }
        else if(hoursSleep> 10){
            System.out.println("Wow you slept for a long time!");
        }
        else if (hoursSleep > 5 && hoursSleep < 10){
            System.out.println("Buy a coffee :)");

        }
    }
}
