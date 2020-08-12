package com.codedifferently;

public class RemoveCharFromString {

  public static String remove(String word, char unwanted){
    return word.replaceAll(String.valueOf(unwanted), "");
    // StringBuilder modifiedWord = new StringBuilder();
    //   for(char letter: word.toCharArray()) {
    //     if(letter != unwanted) {
    //       modifiedWord.append(letter);
    //     }
    //   }
    // return modifiedWord.toString();
  }

  /*Extra Credit Flex*/
  public static String removeRecursive(String word, char ch){
    int index = word.indexOf(ch);
    if(index == -1) {
      return word;
    }
    return removeRecursive(word.substring(0, index) + word.substring(index + 1), ch);
  }
}
