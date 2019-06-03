package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Grader
{
    //Creates arrays to hold the grading criteria, the weight of each criteria, the scale used for grading, and the
    //grades themselves
    private String[] gradingCriteria;
    private int[] criteriaWieght;
    private int[] gradingScale;
    private double[][] gradeHolder;
    //Holds various grades from each criteria. Each column corresponds with a different grading criteria.
    //Each counter keeps track of how many grades are in each criteria column because the array will be partially filled
    //I would like to be able to use something like criteriaGradeCounter'i' which is linked to each column without
    //using 20 if else statements or a switch statement with 20 cases. Is this possible?
    private int criteria1_GradeCounter = 0;
    private int criteria2_GradeCounter = 0;
    private int criteria3_GradeCounter = 0;
    private int criteria4_GradeCounter = 0;
    private int criteria5_GradeCounter = 0;
    private int criteria6_GradeCounter = 0;
    private int criteria7_GradeCounter = 0;
    private int criteria8_GradeCounter = 0;
    private int criteria9_GradeCounter = 0;
    private int criteria10_GradeCounter = 0;
    private int criteria11_GradeCounter = 0;
    private int criteria12_GradeCounter = 0;
    private int criteria13_GradeCounter = 0;
    private int criteria14_GradeCounter = 0;
    private int criteria15_GradeCounter = 0;
    private int criteria16_GradeCounter = 0;
    private int criteria17_GradeCounter = 0;
    private int criteria18_GradeCounter = 0;
    private int criteria19_GradeCounter = 0;
    private int criteria20_GradeCounter = 0;
    private int criteriaLength;

    /**
     * Constructs a grader object.
     * @param criteriaInput String Array of the criteria being graded in a class (e.g. Homework, Quizzes,
     *                      Participation...).
     * @param criteriaTracker Keeps track of how many elements are stored in the criteriaInput array. The value
     *                        of criteriaTracker corresponds to the last filled index in the array, under the assumption
     *                        that there are no gaps in the array up till that point.
     * @param weightInput Int Array of how much weight is given to each criteria (e.g. 20%, 30%, 10%...) index of weight
     *                    should correspond with the index of the criteria with that weight.
     * @param scaleInput Int Array to specify a non-standard grading scale. Index 0: A+, 1: A, 2: A-... The ints
     *                   represent the lowest in the grading range (e.g. [97, 93, 90,...])
     */
    public Grader(String[] criteriaInput, int criteriaTracker, int[] weightInput, int[] scaleInput)
    {
        //Assigns private variable to the appropriate constructor parameters
        //Makes copies of the array parameters instead of using references so the private variables cannot be changed
        //outside the class methods
        gradingCriteria = Arrays.copyOf(criteriaInput, criteriaTracker);
        criteriaWieght = Arrays.copyOf(weightInput, weightInput.length);
        gradingScale = Arrays.copyOf(scaleInput, scaleInput.length);
        criteriaLength = criteriaTracker;
        //Twenty columns for a maximum of 20 different grading criteria. 70 rows for a maximum of 70 different criteria
        //grades
        gradeHolder = new double[20][70];
    }

    /**
     * Asks for new grade inputs and stores them.
     *
     * No Return
     * No Parameters
     */
    public void inputNewGrades()
    {
        //Asks user to input new grades
        System.out.println("Please enter new grades for the following criteria.\n");
        //Creates a scanner "in" to track their input
        Scanner in = new Scanner(System.in);
        //Loop that executes for each existing criteria
        for(int i = 0; i <= criteriaLength; i++)
        {
            //Prints the grading criteria name followed by a colon (e.g. "Homework: ")
            System.out.println(gradingCriteria[i] + ": ");
            //Loop that executes while there are still new grades for a criteria
            //Allows user to input multiple grades at the same time (e.g. Homework: "97 84 88.5")
            while(in.hasNextDouble())
            {
                //Stores the next grade input in the variable newGrade
                double newGrade = in.nextDouble();
                /*
                Is there a way for me to make the criteriaGradeCounters change within the loop or do I have to use a
                very long switch statement. Is there something that works like criteriaGradeCounter'i' that only
                tracks the inputs to the 'i'th column?
                */
                //Stores the new grade in the gradeHolder matrix at the end of the 'i'th column which corresponds to the
                //'i'th criteria
                gradeHolder[i][criteria1_GradeCounter] = newGrade;
                //Tracks the next empty position in the criteria1 column for the gradeHolder matrix
                criteria1_GradeCounter++;
                /*
                If there is a way for the counter to automatically change this is all I would need to write. Otherwise,
                I would have to rewrite this 20 times with if else or switch statements just swapping out which
                criteriaGradeCounter I am using.
                */

                //FOR LATER VERSIONS
                //Store array in a separate file so it can be accessed after the program is terminated. Need to learn
                //how file I/O works in Java.
            }
        }
    }
}
