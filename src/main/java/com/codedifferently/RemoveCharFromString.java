import java.util.logging.Logger; 
class Main {
  private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

  public static void main(String[] args) {
    System.out.println("Hello world!");
    logger.info(remove("abc", 'a'));
    logger.info(remove("abcd", 'c'));
    logger.info(remove("", 'd'));
    logger.info(removeRecursive("abcdefgh", 'a'));
    logger.info(removeRecursive("abcd", 'c'));
    logger.info(removeRecursive("abcd", 'd'));
    logger.info(remove("aaaaaaaaaaaaaa", 'a'));
    logger.info(remove("aaaaaaaaaaaaaab", 'a'));
  }

  public static String remove(String word, char unwanted){
    // StringBuilder modifiedWord = new StringBuilder();
    //   for(char letter: word.toCharArray()) {
    //     if(letter != unwanted) {
    //       modifiedWord.append(letter);
    //     }
    //   }
    // return modifiedWord.toString();
    return word.replaceAll(String.valueOf(unwanted), "");
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
