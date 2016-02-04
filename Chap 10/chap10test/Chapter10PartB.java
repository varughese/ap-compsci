public class Chapter10PartB {
   // Yes because concepts of public and private apply
   // to the class as a whole not to the individual
   // objects of the class
   public boolean isGreaterThan(Fraction other) {
      return true; // code wont compile otherwise because not in Fraction class
      //return getValue() > other.getValue();
   }
   
   // problem 22
   // Canvas.add(new Balloon(50, 100, 20, new Color(60, 35, 15));
   
   
   // problem 24
   // No, because the client class will not have access to the EggBasket's eggs.
   // This, and the move method will change the original baskets. The method
   // would have to create temporary objects that hold the EggBasekts, which would
   // still change the original baskets.
}