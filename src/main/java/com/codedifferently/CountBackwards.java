package com.codedifferently;

public class CountBackwards 
{
    //count backwards from any number 

    //iterative 
    public String countBackwards(int number)
    {
        String backwards = "";
        while(number> 0)
        {
            backwards+= number + " ";
            //+= 
            //backwards = backwards + number + " "
            number--;
            // number = number - 1;
            // number = number +1;
        }
        return backwards;
    }
    public String countBackwardforloop(int number)
    {
        String backwards = "";
        for(int i = number; i>0;i--)
        {
            backwards += i + " ";
            
        }
        
        return backwards.trim();
    }
    //recursive
    public String countBackwardsrecursive(int number)
    {
        String backwards = "";
        if (number == 1) 
        {
            backwards +=1;
            return backwards.trim();   
        }
        else
        {
            return  number + " " + countBackwardforloop(number -1);
        }
    }
    
}