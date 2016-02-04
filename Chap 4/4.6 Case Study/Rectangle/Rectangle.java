public class Rectangle {
   private int width;
   private int height;
   private String color;

   public Rectangle(int h, int w) {
      width = w;
      height = h;
   }
   
   public Rectangle(String c, int h, int w) {
      color = c;
      height = h;
      width = w;
   }

   public void speak() {
   
      System.out.print(height);
      
      System.out.print(color);
   }

}