package com.codedifferently;

//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;

public class RemoveCharFromString {
   // private static final Logger logger = LoggerFactory.getLogger(RemoveCharFromString.class);

    /*public String remove2(String word, char unwanted){
        String copy = word;
        String result = "";

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == unwanted){
                copy = copy.substring(0, i) + copy.substring(i+1);
            }
        }
        if(!copy.isEmpty()){
            result = copy;
        }
        return result;
    }*/

    public String remove(String word, char unwanted){

        word = word.replaceAll(unwanted + "", "");
        word = word.trim();
        return word;
    }

    /*Extra Credit Flex*/
    public String removeRecursive(String word, char ch){

        if(word.length() == 0 || word.indexOf(ch) == -1){
            return "";
        }
        word = word.substring(0,word.indexOf(ch)) + word.substring(word.indexOf(ch)+1);
        return word + removeRecursive(word , ch);
    }
}
