// Chapter 7 Question 23

public class Near1776
{
   private static final int numTarget = 1, denomTarget = 7;
   private static final double target = (double)numTarget / denomTarget;

   public static void main(String args[])
   {
      int numLeft = 0, denomLeft = 100, numRight = 100, denomRight = 100;
      double leftDiff = 1, rightDiff = 1;
   
      for (int denom = 2; denom <= 100; denom++)
      {
         for (int num = 1; num < denom; num++)
         {
            double d = (double)num / denom - target;
            if (d > 0 && d < rightDiff)
            {
               rightDiff = d;
               numRight = num;
               denomRight = denom;
            }
            
            d = -d;
            
            if (d > 0 && d < leftDiff)
            {
               leftDiff = d;
               numLeft = num;
               denomLeft = denom;
            }
         }
      }
      System.out.println(numLeft + "/" + denomLeft + " < " +
                          numTarget + "/" + denomTarget + " < " +
                          numRight + "/" + denomRight);
   }
}

