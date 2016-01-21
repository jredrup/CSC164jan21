package com.company;

import java.util.Scanner;

/*
Jeremy Redrup
CSC164
Demo Menu Program
Jan 21, 2016
ver 0.1
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char option;
        System.out.println("Welcome to Jimmy Johns!");
        do{
            System.out.println("(H)am");
            System.out.println("(R)oast Beef");
            System.out.println("(S)alami");
            System.out.println("(T)una");
            System.out.println("(D)one");
            System.out.print("Please enter your selection: ");
            String choice = input.next();
            choice = choice.toUpperCase();
            option = choice.charAt(0);


        }while (option != 'D');
        System.out.println("Thank you for visiting Jimmy Johns!");
    }
}
