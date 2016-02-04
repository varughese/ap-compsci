public class Prob18 {
   public static boolean isPalindrome(String word) {
      if(word.equals("")) { return false; } // if its an empty string it doesnt count
      
      // ignore case
      word = word.toLowerCase();
      
      // will hold the word minus all of the puncuation
      String newWord = "";
      
      // loops through the word and adds each character to newWord only if it is a digit 
      for(int i=0; i<word.length(); i++) {
         
         if(Character.isLetterOrDigit(word.charAt(i))) {
            newWord += "" + word.charAt(i);
         }
      
      }

      //holds reversed word
      String reversed = "";
      
      // loops through new word and adds letter starting from end to the word
      for(int i=0; i<newWord.length(); i++) {
         reversed+="" + newWord.charAt(newWord.length()-1-i);
      }
      
      // if the original and reversed word are Palindromes, compareTo will be 0, thus returning true
      return (newWord.compareTo(reversed) == 0);
   }
   public static void main(String[] args) {
      System.out.print(isPalindrome("Mathew Varughese, Ese hgurav weh tam!"));
   }
}