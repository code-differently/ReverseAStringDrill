package com.codedifferently;

//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;

public class RemoveCharFromString {
    //private static final Logger logger = LoggerFactory.getLogger(RemoveCharFromString.class);

    public String remove(String word, char unwanted){
        return word.replaceAll(unwanted + "", "");
    }

    /*Extra Credit Flex*/
    public String removeRecursive(String word, char ch){
        int chIndex = word.indexOf(ch);
        if(chIndex == -1)
            return word;

        StringBuilder ret = new StringBuilder();
        for(int i = 0; i < word.length(); i++) {
            if(i != chIndex) {
                ret.append(word.charAt(i));
            }
        }

        return removeRecursive(ret.toString(), ch);
    }
}
