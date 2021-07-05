package com.codedifferently;

public class Fibonnaci1 
{
    
    public int fibbonaciterative(int number)
    {
        if(number <= 1)
        {
            return number;
        }
            int previousTerm = 1; 
            int nextTerm = 1;
            for (int i = 2; i < number; i++) 
            {
                int temp = previousTerm; // temp value to hold previous term
                previousTerm += nextTerm; // adds previous term and next term like fibonnaci should
                nextTerm = temp; //next term becomes what previous term was
            }
        
        return nextTerm;
    }
    public int fibonnaci(int number)
    {
        if (number <=1) 
        {
            return number;
        }
        else
        {
            return fibonnaci(number -1) + fibonnaci(number - 2);
        }
    }
}