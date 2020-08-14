package com.codedifferently;
import org.junit.Assert;
import org.junit.Test;
public class FibonnaciTest 
{
    @Test
    public void fibbonaciTest1()
    {
        //Given
        Fibonnaci1 fibonnaci = new Fibonnaci1();
        int number =13;
        //When 
        Integer expected = 144;
        Integer actual = fibonnaci.fibbonaciterative(number);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void fibbonaciTest2()
    {
        //Given
        Fibonnaci1 fibonnaci = new Fibonnaci1();
        int number =12;
        //When 
        Integer expected = 144;
        Integer actual = fibonnaci.fibonnaci(number);
        //Then
        Assert.assertEquals(expected, actual);
    }
    
}