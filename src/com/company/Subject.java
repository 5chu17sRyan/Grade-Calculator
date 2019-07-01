package com.company;

import java.util.Scanner;

public class Subject {
    private String subjectName;

    Subject(String subjectName)
    {
        this.subjectName = subjectName;
        Grader grader = new Grader();
    }

    public void setCriteria()
    {
        while(true)
        {
            printEndCondition();
            Scanner in = new Scanner( System.in );
            if( !in.next().equals( "q" ) )
            {
                createCriterion();
            }
            else
            {
                break;
            }
        }
    }

    private void printEndCondition()
    {
        System.out.println( "If you are done creating grading criteria, press \"q\" to quit." );
    }

    private void createCriterion()
    {
        Record criterion = new Record(inputCriterionName(), inputCriterionWeight());
        grader.add[criterion];
    }

    private String inputCriterionName()
    {
        printCriterionNamePrompt();
        Scanner in = new Scanner(System.in);
        String criteria = in.next();
        return criteria;
    }

    private void printCriterionNamePrompt()
    {
        System.out.println( "Please enter a new grading criterion name as you wish to see it in the future.\n" );
    }

    private int inputCriterionWeight()
    {
        printCriterionWeightPrompt();
        Scanner in = new Scanner( System.in );
        int weight = in.nextInt();
        return weight;
    }

    private void printCriterionWeightPrompt()
    {
        System.out.println( "How much is this criteria weighted. Please enter the integer value of the percent" );
    }

}
