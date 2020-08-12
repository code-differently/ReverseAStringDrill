package com.codedifferently;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class RemoveCharFromString {
    /*
    private static final Logger logger = LoggerFactory.getLogger(RemoveCharFromString.class);

    */

    public String remove(String word, char unwanted){
        String str = "";
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != unwanted){
                str += word.charAt(i);
            }
        }
        return str;
    }

    /*Extra Credit Flex*/
    public String removeRecursive(String word, char ch){

        if(word.length() == 0){
            return word;
        }else{

        }
        return null;
    }
}
