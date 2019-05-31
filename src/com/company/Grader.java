package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Grader
{
    //Creates arrays to hold the grading criteria, the weight of each criteria, and the scale used for grading
    private ArrayList<String> gradingCriteria;
    private int[] criteriaWieght;
    private int[] gradingScale;

    //constructor for the Grader Class, with criteria, weight, and scale as parameters
    public Grader(ArrayList<String> criteriaInput, int[] weightInput, int[] scaleInput)
    {
        //Assigns private variable to the appropriate constructor parameters
        //Makes copies of the parameters instead of using references so the private variables cannot be changed outside
        //the class methods
        gradingCriteria = new ArrayList<>(criteriaInput);
        criteriaWieght = Arrays.copyOf(weightInput, weightInput.length);
        gradingScale = Arrays.copyOf(scaleInput, scaleInput.length);
    }
}
