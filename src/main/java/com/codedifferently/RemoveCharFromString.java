package com.codedifferently;

/* import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory; */

public class RemoveCharFromString {
   /* private static final Logger logger = LoggerFactory.getLogger(RemoveCharFromString.class); */

    public String remove(String word, char unwanted){
        StringBuilder str = new StringBuilder(); // allows String manipulation and building of new string
        char[] letters = word.toCharArray(); // Strings are an array of characters, creating char array

        for(char c : letters){ // for-each character in char array letters
            if(c != unwanted){ // if character does not equal unwanted
                str.append(c); // add it to the end String builder
            }
        }
        return str.toString(); // return StringBuilder into a String
    }

    /*Extra Credit Flex*/
    public String removeRecursive(String word, char ch){
        return null;
    }
}
