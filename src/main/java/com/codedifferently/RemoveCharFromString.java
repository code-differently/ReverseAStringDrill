package com.codedifferently;

//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;

public class RemoveCharFromString {
    //private static final Logger logger = LoggerFactory.getLogger(RemoveCharFromString.class);

    public String remove(String word, char unwanted){
        // Create empty string to return
        String result = "";
        // iter through each character in string input, word
        for (int idx = 0; idx <= word.length() - 1; idx++) {
            Character currChar = word.charAt(idx);
            if (!currChar.equals(unwanted)){ // as long as the current character is NOT equal to unwanted, then add it to result
                result += currChar;
            }
        }
        return result;
    } // Try with StringBuilder

    /*Extra Credit Flex*/
    public String removeRecursive(String word, char ch)
    {
        int index = word.indexOf(ch);
        if(index < 0)
        {
            return word;
        }
        else
        {
            return removeRecursive(word.substring(0, index) + word.substring(index + 1), ch);
        }
    }
}
