public class Card {
	private final Rank rank;
   private final Suit suit;
 
   
   public Card(Rank rank, Suit suit) {
      this.rank = rank;
      this.suit = suit;
   }
   
   public enum Rank {
		ACE, DUECE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,
      
      JACK, QUEEN, KING
	}
   
   public enum Suit {
      DIAMOND, SPADE, CLUB, HEART
   }
   
   public String toString() {
      return "I AM A " + rank + " OF " + suit + "s.";
   }
   
   
	public static void main(String[] args) {

      Card c = new Card(Rank.FOUR, Suit.HEART);
      
    
      
      System.out.print(c);


	}
}