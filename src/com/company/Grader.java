package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Grader
{
    //Creates arrays to hold the grading criteria, the weight of each criteria, and the scale used for grading
    private ArrayList<String> gradingCriteria;
    private int[] criteriaWieght;
    private int[] gradingScale;
    private double[][] gradeHolder;

    /**
     * Constructs a grader object.
     * @param criteriaInput String ArrayList of the criteria being graded in a class (e.g. Homework, Quizzes,
     *                      Participation...).
     * @param weightInput Int Array of how much weight is given to each criteria (e.g. 20%, 30%, 10%...) index of weight
     *                    should correspond with the index of the criteria with that weight.
     * @param scaleInput Int Array to specify a non-standard grading scale. Index 0: A+, 1: A, 2: A-... The ints
     *                   represent the lowest in the grading range (e.g. [97, 93, 90,...]
     */
    public Grader(ArrayList<String> criteriaInput, int[] weightInput, int[] scaleInput)
    {
        //Assigns private variable to the appropriate constructor parameters
        //Makes copies of the parameters instead of using references so the private variables cannot be changed outside
        //the class methods
        gradingCriteria = new ArrayList<>(criteriaInput);
        criteriaWieght = Arrays.copyOf(weightInput, weightInput.length);
        gradingScale = Arrays.copyOf(scaleInput, scaleInput.length);
        gradeHolder = new double[gradingCriteria.size()][70];
    }

    public void inputNewGrade()
    {
        System.out.println("Please enter new grades for the following criteria");
        Scanner in = new Scanner(System.in);
        for(String element: gradingCriteria)
        {
            System.out.println(element + ":");
            double newGrade = in.nextDouble();

        }
    }
}
