import java.util.logging.Logger; 
class Main {
  private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

  public static void main(String[] args) {
    System.out.println("Hello world!");
    logger.info(remove("abc", 'a'));
    logger.info(remove("abcd", 'c'));
    logger.info(remove("", 'd'));
    logger.info(remove("abcd", 'd'));
  }

  public static String remove(String word, char unwanted){
    StringBuilder modifiedWord = new StringBuilder();
      for(char letter: word.toCharArray()) {
        if(letter != unwanted) {
          modifiedWord.append(letter);
        }
      }
    return modifiedWord.toString();
  }

  /*Extra Credit Flex*/
  public String removeRecursive(String word, char ch){
    int index = word.indexOf(ch);
    if(index == -1) {
      return word;
    }
    return removeRecursive(word.substring(0, index) + word.substring(index), ch);
  }
}
