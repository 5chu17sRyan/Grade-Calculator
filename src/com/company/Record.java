package com.company;

import java.util.ArrayList;

public class Record{
    public String criteria;
    public int weight;
    public ArrayList<Double> gradeValues;

    Record(String criteria, int weight)
    {
        this.criteria = criteria;
        this.weight = weight;
    }
}
