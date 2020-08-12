package com.codedifferently;

//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;

public class RemoveCharFromString {
    //private static final Logger logger = LoggerFactory.getLogger(RemoveCharFromString.class);

    public String remove(String word, char unwanted){
        /*String word = "";*/    //didn't work because word is already defined in the scope
        word = word.replaceAll(String.valueOf(unwanted), "");   //replace the unwanted character in the string word and replace it with parenthesis
                                //uses String.valueOf to return the string representation of unwanted which is a char
        return word;    //return the new replaced word
    }

    /*Extra Credit Flex*/
    public String removeRecursive(String word, char ch){
        return null;
    }
}
