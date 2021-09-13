package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Yeshwanth Mandava
 */

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many people are there: ");
        int Ppl = input.nextInt();

        System.out.print("How many pizzas do you have? ");
        int Pizza = input.nextInt();

        System.out.print("How many slices are there per pizza? ");
        int PizzaSlices = input.nextInt();

        int TotSlices = PizzaSlices * Pizza;
        int Leftovers = TotSlices % Ppl;
        int PersonSlices = TotSlices / Ppl;

        System.out.println(Ppl+ " people with " + Pizza + " pizzas, and " + PizzaSlices+ " slices per pizza, for a total of " +TotSlices+ " slices.");
        System.out.println("Each person gets " +PersonSlices+ " pieces of pizza.");
        System.out.println("There are " +Leftovers+ " pieces of pizza leftover.");

        }

    }

