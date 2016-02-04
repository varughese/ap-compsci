public class HangmanGame {

   private String word;
   private StringBuffer guessed;
   private StringBuffer tried = new StringBuffer("");
   
   public HangmanGame(String w) {
      word = w;
      guessed = new StringBuffer(w);
      for(int i=0; i<guessed.length(); i++) {
         guessed.setCharAt(i, '-');
      }
      System.out.println("WORD: " + word);
   }
   
   public String getWord() {
      return word;
   }

   public String getGuessed() {
      return guessed.toString();
   }
   
   public String getTried() {
      
      return tried.toString();
   }
   
   public int tryLetter(char letter) {
      if(tried.toString().indexOf(letter) >= 0) {
         return 0;
      }   
      
      tried.append(letter);
      
      if(word.indexOf(letter) >= 0) {
         
         for(int i =0; i<word.length(); i++) {
            if(word.charAt(i) == letter) {
               guessed.setCharAt(i, letter);
            }
         }
         
                  
         return 1;
      }
      
      return -1;
   }

}