package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Asks user to input their grading criteria
        System.out.println("What are you being graded on?\n" +
                "(Enter all criteria names separated by a space before hitting return and enter them as you wish to " +
                "see them in the future)\n");
        //Creates scanner to read input
        Scanner in = new Scanner(System.in);
        //20 is the Maximum number of grading criteria allowed by this program
        final int MAX_GRADING_CRITERIA = 20;
        //Creates a string array to hold the names of the criteria
        String[] criteriaInput = new String[MAX_GRADING_CRITERIA];
        //Variable to track the current size of the criteriaInput array set to 0
        int criteriaSize = 0;
        //While there are still criteria names from the user execute the following code
        while(in.hasNext())
        {
            //If there are more input than allowed
            if(criteriaSize++ > MAX_GRADING_CRITERIA)
            {
                //Tells the user that they cannot have more than 20 criteria
                System.out.println("20 is the maximum number of grading criteria allowed. Consider combining" +
                        "categories with the same grading weight. For example, if both homework and participation" +
                        "count for 20% of the entire grade combine the two into a category " +
                        "\"Homework/Participation\"\n");
                //Exits while loop so no more than twenty names are input into the array.
                break;
            }
            //Stores next criteria name in next available array element
            criteriaInput[criteriaSize] =  in.next();
            //Keeps track of array size by incrementing by one
            criteriaSize++;
        }

        //Asks the user for the weight of each criteria
        System.out.println("How are these criteria weighted?");
        //Creates array the size of criteriaInput to hold the weights of each criteria
        int[] weightInput = new int[criteriaSize];
        //Executes the following block for each criteria
        for(int i = 0; i <= criteriaSize; i++)
        {
            //Prints out name of criteria followed by a colon
            System.out.println(criteriaInput[i] + ": ");
            //Fills in the array with the corresponding criteria weight
            weightInput[i] = in.nextInt();
        }


    }
}
