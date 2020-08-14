package com.codedifferently;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class RemoveCharFromString {
   // private static final Logger logger = LoggerFactory.getLogger(RemoveCharFromString.class);

   //Step one find the index of the char you want to remove in the string(if it exists)
   //Step 2 use the substring function to add the elements up to the unwanted charater and the elements after the unwanted character (if such exists)
   
    public String remove(String word, char unwanted){
        String removed = "";
        //char [] chararry = {'h', 'e', 'l' , 'l', 'o'};
        //String notchararry = "hello";
        int findCharatIndex = -1;
        for (int i = 0; i < word.length(); i++) 
        {
            //chararry[i] != unwanted
            if (word.charAt(i) != unwanted) 
            {
                //char c = word.charAt(i)
                // String word = "hi"
                // word.charAt(0)
                //h
                findCharatIndex = i;
                removed += word.charAt(i);
            }    
        }

        return removed;
    }
    //just remembered indexOf
    //but what if there are multiple unwanted characters in a string?
    // if i had time to figure it out i would
    /*Extra Credit Flex*/
    //remove the unwanted character until it doesn't exist in the string
    //when it doesn't exist in the string return the word base case
    public String removeRecursive(String word, char ch)
    {
        int findCharatIndex = word.indexOf(Character.toString(ch)); // searches through the string for a specific character and returns its index if not found return -1
        if(findCharatIndex == -1)  // if the character is not found then return the word
        {
            return word;
        }
        else // if the character is found then take out the  unwanted character in the word and call the function with the new word
        {
            String newWord = word.substring(0, findCharatIndex) + word.substring(findCharatIndex+1, word.length()); 
            return removeRecursive(newWord, ch);
        }
    }
}
