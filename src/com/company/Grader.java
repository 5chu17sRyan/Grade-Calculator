package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Grader extends ArrayList<Record>
{
    /**
     * Asks for new grade inputs and stores them.
     *
     * No Return
     * No Parameters
     */
    public void inputNewGrades() {
        printPromptHeading();

        for(int i = 0; i < size(); i++) { // Note that because Grader inherits ArrayList, size() refers to this.size()
            final Record currentRecord = get(i);
            currentRecord.gradeValues = getGradesFromUser(currentRecord.criteria);
        }
    }

    private void printPromptHeading() {
        System.out.println("Please enter new grades for the following criteria.\n");
    }

    private ArrayList<Double> getGradesFromUser(String criteria) {
        final Scanner in = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        printPrompt(criteria);
        grades = parseInputForGrades(in);

        return grades;
    }

    private void printPrompt(String criteria) {
        System.out.println(criteria + ": ");
    }

    private ArrayList<Double> parseInputForGrades(Scanner in) {
        final ArrayList<Double> grades = new ArrayList<>();

        while(in.hasNextDouble()) {
            final Double newGrade = new Double(in.nextDouble()); // unsure if the new Double() bit is necessary here, but putting it there just in case.
            grades.add(newGrade);
        }

        return grades;
    }


    /**
     * Calculates and returns current grade in a class. Uses information from gradeHolder[]
     * and criteriaWeight[]
     * @return Returns current grade in the class
     */
    /*public double calculateGrade()
    {
        //For each criteria stored in gradingCriteria[]
        for(int i = 0; i <= criteriaLength; i++)
        {
            //"total" keeps track of the sum of the column. Initialized to zero.
            double total = 0;
            //Will hold the the mean value of the column. Initialized to zero.
            double currentCriteriaAverage = 0;
            //For each column adds up all of the elements than calculates average
            //Using switch to to know the length of each column through criteriaGradeCounter
            switch(i)
            {
                case 0:
                 //Goes through each element in the column
                    for(int k = 0; k <= criteria1_GradeCounter; k++)
                {
                    //Adds each element in the column to the total;
                    total = total + gradeHolder[i][k];
                    //Calculates the mean element value in the column
                    currentCriteriaAverage = total / criteria1_GradeCounter;
                }
                case 1: for(int k = 0; k <= criteria2_GradeCounter; k++)
                {
                    total = total + gradeHolder[i][k];
                    currentCriteriaAverage = total / criteria2_GradeCounter;
                }
                case 2: for(int k = 0; k <= criteria3_GradeCounter; k++)
                {
                    total = total + gradeHolder[i][k];
                    currentCriteriaAverage = total / criteria3_GradeCounter;
                }
                case 3: for(int k = 0; k <= criteria4_GradeCounter; k++)
                {
                    total = total + gradeHolder[i][k];
                    currentCriteriaAverage = total / criteria4_GradeCounter;
                }
                case 4: for(int k = 0; k <= criteria5_GradeCounter; k++)
                {
                    total = total + gradeHolder[i][k];
                    currentCriteriaAverage = total / criteria5_GradeCounter;
                }
                case 5: for(int k = 0; k <= criteria6_GradeCounter; k++)
                {
                    total = total + gradeHolder[i][k];
                    currentCriteriaAverage = total / criteria6_GradeCounter;
                }
                case 6: for(int k = 0; k <= criteria7_GradeCounter; k++)
                {
                    total = total + gradeHolder[i][k];
                    currentCriteriaAverage = total / criteria7_GradeCounter;
                }
                case 7: for(int k = 0; k <= criteria8_GradeCounter; k++)
                {
                    total = total + gradeHolder[i][k];
                    currentCriteriaAverage = total / criteria8_GradeCounter;
                }
                case 8: for(int k = 0; k <= criteria9_GradeCounter; k++)
                {
                    total = total + gradeHolder[i][k];
                    currentCriteriaAverage = total / criteria9_GradeCounter;
                }
                case 9: for(int k = 0; k <= criteria10_GradeCounter; k++)
                {
                    total = total + gradeHolder[i][k];
                    currentCriteriaAverage = total / criteria10_GradeCounter;
                }
                case 10: for(int k = 0; k <= criteria11_GradeCounter; k++)
                {
                    total = total + gradeHolder[i][k];
                    currentCriteriaAverage = total / criteria11_GradeCounter;
                }
                case 11: for(int k = 0; k <= criteria12_GradeCounter; k++)
                {
                    total = total + gradeHolder[i][k];
                    currentCriteriaAverage = total / criteria12_GradeCounter;
                }
                case 12: for(int k = 0; k <= criteria13_GradeCounter; k++)
                {
                    total = total + gradeHolder[i][k];
                    currentCriteriaAverage = total / criteria13_GradeCounter;
                }
                case 13: for(int k = 0; k <= criteria14_GradeCounter; k++)
                {
                    total = total + gradeHolder[i][k];
                    currentCriteriaAverage = total / criteria14_GradeCounter;
                }
                case 14: for(int k = 0; k <= criteria15_GradeCounter; k++)
                {
                    total = total + gradeHolder[i][k];
                    currentCriteriaAverage = total / criteria15_GradeCounter;
                }
                case 15: for(int k = 0; k <= criteria16_GradeCounter; k++)
                {
                    total = total + gradeHolder[i][k];
                    currentCriteriaAverage = total / criteria16_GradeCounter;
                }
                case 16: for(int k = 0; k <= criteria17_GradeCounter; k++)
                {
                    total = total + gradeHolder[i][k];
                    currentCriteriaAverage = total / criteria17_GradeCounter;
                }
                case 17: for(int k = 0; k <= criteria18_GradeCounter; k++)
                {
                    total = total + gradeHolder[i][k];
                    currentCriteriaAverage = total / criteria18_GradeCounter;
                }
                case 18: for(int k = 0; k <= criteria19_GradeCounter; k++)
                {
                    total = total + gradeHolder[i][k];
                    currentCriteriaAverage = total / criteria19_GradeCounter;
                }
                case 19: for(int k = 0; k <= criteria20_GradeCounter; k++)
                {
                    total = total + gradeHolder[i][k];
                    currentCriteriaAverage = total / criteria20_GradeCounter;
                }
            }
            //Calculates the final contribution of the column to the final grade.
            double currentCriteriaGrade = (currentCriteriaAverage * criteriaWeight[i]) / 100;
            //Adds the columns contribution to the finalGrade variable.
            finalGrade = finalGrade + currentCriteriaGrade;
        }
        //Returns the double value for the final grade.
        return finalGrade;
    }

    //public String returnLetterGrade(double finalGrade);

     */
}
