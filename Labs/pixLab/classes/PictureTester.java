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
    
    pic2.explore();
    
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //repairTemple();
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
   // testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    
    //flipHorizontal();
    flipVertical();
  }
}