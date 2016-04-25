import java.util.*;

public class TestFrq {
   public static double[][] tester(int numRows, int numCols, double[] scanned) {
       double[][] view = new double[numRows][numCols];
       int counter = 0;
       for(int r=0; r<numRows; r++) {
           boolean reverse = r%2 != 0;
           for(int c=0; c<numCols; c++) {
               if(reverse)
                   view[r][numCols-c-1] = scanned[counter];
               else
                   view[r][c] = scanned[counter];
   
               counter++;
           }
       }
       return view;
   }
   
   public static void main(String[] args) {
      /*
      double[] scanned = {0.3, .7, .8, .4, 1.4, 1.1, .2, .5, .1, 1.6, .6, .9};
      double[][] view = tester(4,3,scanned);
      for(double[] x : view) {
         for(double y : x) {
          System.out.print(y + " ");
         }
         System.out.println();
      }*/
      System.out.println(0xFF);
   }
}