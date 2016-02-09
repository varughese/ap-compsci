/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testZeroRed()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroRed();
    beach.explore();
  }
  public static void convertToBlackAndWhite() {
     Picture pic = new Picture("femaleLionAndHall.jpg");
     pic.explore();
     Pixel[][] p = pic.getPixels2D();
     for(int row = 0; row<p.length; row++) {
        for(int col = 0; col<p[0].length; col++) {
            int avg = (int)p[row][col].getAverage();
            p[row][col].setRed(avg);
            p[row][col].setBlue(avg);
            p[row][col].setGreen(avg);
        }
     }
     pic.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void adjustBrightness(double x) {
    
    Picture pic = new Picture("koala.jpg");
     pic.explore();
     Pixel[][] p = pic.getPixels2D();
    for(int row = 0; row<p.length; row++) {
        for(int col = 0; col<p[0].length; col++) {
            Pixel px = p[row][col];
            int red = px.getRed();
            int blue = px.getBlue();
            int green = px.getGreen();
    
            
            if(red*x > 255 || blue*x > 255 || green*x > 255){
                int newX = 1;
                if(red*x > 255){
                    int temp = 255-red;
                    int avg = 1 + (int)temp/red;
                    newX = avg;
                }
                if(blue*x > 255){
                    int temp = 255-blue;
                    int avg = 1 + (int)temp/blue;
                    newX = avg;
                }
                if(green*x > 255){
                    int temp = 255-green;
                    int avg = 1 + (int)temp/green;
                    newX = avg;
                }
                
                px.setRed(red*newX);
                px.setBlue(blue*newX);
                px.setGreen(green*newX);
            } else  {
                int r = (int)(red*x);
                int b = (int)(blue*x);
                int g = (int)(green*x);
                
                px.setRed(r);
                px.setBlue(b);
                px.setGreen(g);
            }
        }
     }
      pic.explore();
  }
  
  public static void verticalMirror() {
     Picture pic = new Picture("redMotorcycle.jpg");
     pic.explore();
     Pixel[][] pixels = pic.getPixels2D();
     for(int row = 0; row < pixels.length; row++) {
        for(int col = 0; col < (pixels[0].length-1) / 2; col++) {
            Pixel a = pixels[row][col];
            pixels[row][pic.getWidth() - 1 - col].setRed(pixels[row][col].getRed());
            pixels[row][pic.getWidth() - 1 - col].setBlue(pixels[row][col].getBlue());
            pixels[row][pic.getWidth() - 1 - col].setGreen(pixels[row][col].getGreen());
        }
     }
     pic.explore();
  }
  
  
  public static void repairTemple() {
    Picture pic = new Picture("temple.jpg");
    pic.explore();
    Pixel[][] pixels = pic.getPixels2D();
    for(int row = 27; row <= 96; row++) {
      for(int col = 13; col <= 275; col++) {
         Pixel p = pixels[row][col];
         int r = p.getRed();
         int b = p.getBlue();
         int g = p.getGreen();
         pixels[row][275*2-col].setRed(r);
         pixels[row][275*2-col].setGreen(g);
         pixels[row][275*2-col].setBlue(b);
      }
    }
    pic.explore();
  }
  
  public static void flipHorizontal(){
    Picture pic1 = new Picture("butterfly1.jpg");
    Picture pic2 = new Picture("butterfly1.jpg");
    pic1.explore();
    Pixel[][] pixels1 = pic1.getPixels2D();
    Pixel[][] pixels2 = pic2.getPixels2D();
    for(int row = 0; row < pixels1.length; row++){
      for(int col = 0; col < pixels2[0].length; col++){
         pixels2[row][pic1.getWidth()-col-1].setRed(pixels1[row][col].getRed());
         pixels2[row][pic1.getWidth()-col-1].setBlue(pixels1[row][col].getBlue());
         pixels2[row][pic1.getWidth()-col-1].setGreen(pixels1[row][col].getGreen());
      }
    }
    
    pic2.explore();
    
  }
  
  public static void flipVertical(){
    Picture pic1 = new Picture("butterfly1.jpg");
    Picture pic2 = new Picture("butterfly1.jpg");
    pic1.explore();
    Pixel[][] pixels1 = pic1.getPixels2D();
    Pixel[][] pixels2 = pic2.getPixels2D();
    for(int row = 0; row < pixels1.length; row++){
      for(int col = 0; col < pixels2[0].length; col++){
         pixels2[pic1.getHeight()-row-1][col].setRed(pixels1[row][col].getRed());
         pixels2[pic1.getHeight()-row-1][col].setBlue(pixels1[row][col].getBlue());
         pixels2[pic1.getHeight()-row-1][col].setGreen(pixels1[row][col].getGreen());
      }
    }
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testZeroRed();
    //convertToBlackAndWhite();
    //adjustBrightness(.8);
    //verticalMirror();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	 //flipHorizontal();
  }
}
