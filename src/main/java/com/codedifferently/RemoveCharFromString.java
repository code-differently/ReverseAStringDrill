package com.codedifferently;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class RemoveCharFromString {
    //private static final Logger logger = LoggerFactory.getLogger(RemoveCharFromString.class);

    public String remove(String word, char unwanted){

        for (char chars : word.toCharArray()){
            if(chars == unwanted){
                word = word.replace(""+chars, "");
            }
        }
        return word;
    }

    /*Extra Credit Flex*/
    public String removeRecursive(String word, char ch){
        if(word.length() == 0){
            return word;
        }
        if(word.charAt(0) == ch){
            return removeRecursive(word.substring(1), ch);
        } else {
            return word.charAt(0) + removeRecursive(word.substring((1)), ch);
        }
    }
}
