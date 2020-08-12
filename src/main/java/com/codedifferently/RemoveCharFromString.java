package com.codedifferently;

public class RemoveCharFromString {

    public String remove(String word, char unwanted){
        String fakeStringBuilder = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != unwanted) {
                fakeStringBuilder += word.charAt(i);
            }
        }
        return fakeStringBuilder;
    }

    /*Extra Credit Flex*/
    public String removeRecursive(String word, char ch){
        if (word.indexOf(ch) == -1) {
            return word;
        } else {
            int chIndex = word.indexOf(ch);
            String newWord = word.substring(0, chIndex) + word.substring(chIndex + 1);
            return removeRecursive(newWord, ch);
        }
    }
}
