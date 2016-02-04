public class PlayingCard {
   private int rank;
   private String suit;

   public PlayingCard() {
      this(1, "spades");
   }
   
   public PlayingCard(int r, String s) {
      rank = r;
      suit = s;
   }
   
   public PlayingCard(PlayingCard c) {
      rank = c.rank;
      suit = c.suit;
   }
   
   public boolean beats(PlayingCard other) {
      return other.suit.equals(suit) && rank >other.rank;
   }
   
   public String toString() {
      return rank + " of " + suit;
   }
   
   public int getRank() {
      return rank;
   }
   
   public String getSuit() {
      return suit;
   }
   
   public void setRank(int r) {
      rank = r;
   }
   
   public void setSuit(String s) {
      suit = s;
   }
}