package com.codedifferently;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class RemoveCharFromString {
   // private static final Logger logger = LoggerFactory.getLogger(RemoveCharFromString.class);

   //Step one find the index of the char you want to remove in the string(if it exists)
   //Step 2 use the substring function to add the elements up to the unwanted charater and the elements after the unwanted character (if such exists)
    public String remove(String word, char unwanted){
        String removed = "";
        int findCharatIndex = 0;
        for (int i = 0; i < word.length(); i++) 
        {
            if (word.charAt(i) == unwanted) 
            {
                findCharatIndex = i;
                removed = word.substring(0, findCharatIndex) + word.substring(findCharatIndex+1);
            }    
        }

        return removed;
    }
    //just remembered indexOf
    //but what if there are multiple unwanted characters in a string?
    // if i had time to figure it out i would
    /*Extra Credit Flex*/
    //remove the unwanted character until it doesn't exist in the string
    //when it doesn't exist in the string return the word
    public String removeRecursive(String word, char ch)
    {
        int findCharatIndex = word.indexOf(ch);
        if(findCharatIndex == -1)
        {
            return word;
        }

        return removeRecursive(word.substring(0, findCharatIndex) + word.substring(findCharatIndex+1, word.length()), ch);
    }
}
