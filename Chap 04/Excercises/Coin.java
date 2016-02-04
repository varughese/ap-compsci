import java.awt.Image;
import java.awt.Graphics;

public class Coin
{
   private Image heads;
   private Image tails;
   private String currentSide;


   /*
    * Constructor takes heads and tails
    */
   public Coin(Image h, Image t)
   {     
      heads = h;
      tails = t;  
      currentSide = "H";
   }
   
   
   /*
    * Flips coin side
    */
   public void flip() {
      if(currentSide == "H") {
         currentSide = "T";
      } else {
         currentSide = "H";
      }
   }
   
   /*
    * Draws the appropiate side ot the coin
    * centered at (x, y)
    */
   public void draw(Graphics g, int x, int y) {
      Image pic;
      
      if(currentSide == "H") {
         pic = heads;
      } else {
         pic = tails;
      }
     
     int width = pic.getWidth(null);
     int height = pic.getHeight(null);
     
     int xUL = x - (width / 2);
     int yUL = y - (height /2);
     
     g.drawImage(pic, xUL, yUL, null);      
   }

}