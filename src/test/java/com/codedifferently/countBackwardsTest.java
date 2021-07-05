package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class countBackwardsTest 
{
    @Test
    public void countBackwardsTest1()
    {
        //given
        CountBackwards countBackwards = new CountBackwards();
        int number = 5;
        //When 
        String expected = "5 4 3 2 1 ";
        String actual = countBackwards.countBackwards(number);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void countBackwardsTest2()
    {
        //given
        CountBackwards countBackwards = new CountBackwards();
        int number = 5;
        //When 
        String expected = "5 4 3 2 1";
        String actual = countBackwards.countBackwardsrecursive(number);
        Assert.assertEquals(expected, actual);
    }
}