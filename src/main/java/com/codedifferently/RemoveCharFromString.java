package com.codedifferently;


public class RemoveCharFromString {

    public String remove(String word, char unwanted)
    {
        for(char c : word.toCharArray())
        {
            if(c == unwanted)
            {
                word = word.replace(c+"", "");
            }
        }
        return word;
    }

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
