public class TestPlayingCard {
   public static void main(String[] args) {
   
      PlayingCard aceOfSpades = new PlayingCard();
      System.out.println(aceOfSpades);
      
      PlayingCard twoOfSpades = new PlayingCard(2, "spades");
      System.out.println(twoOfSpades);
      
      boolean twoBeatsOne = twoOfSpades.beats(aceOfSpades);
      boolean oneBeatsTwo = aceOfSpades.beats(twoOfSpades);
      
      System.out.println(twoBeatsOne);
      System.out.println(oneBeatsTwo);   
   }
}