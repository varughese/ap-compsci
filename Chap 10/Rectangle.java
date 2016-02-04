public class Rectangle {
   /*PROB 2 ANSWERS*/
   /* f,t,t,t,t,t */
   
   /*PROB 3 ANSWERS*/
   /* C */
   int width;
   int height;
   private static int numtwo = 2;
   
   public Rectangle(int w, int h) {
      if(w < 0 || h < 0) {
         throw new IllegalArgumentException("Side lengths must be positive");
      }
      
      width = w;
      height = h;
   }
   
   public Rectangle(int s) {
      this(s, s);
   }
   
   public Rectangle() {
      this(1, 1);
   }
   
   public boolean isSquare() {
      return width == height;
   }
   
   public void quadratize() {
      int area = width * height;
      int squareLength = (int)(Math.sqrt(area));
      width = height = squareLength;
   }
   
}