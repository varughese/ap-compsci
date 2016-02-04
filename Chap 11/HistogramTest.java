import java.util.Scanner;

public class HistogramTest {
   public static boolean invalidData = false;

   public static int[] parseData(String l) {
      String[] x = l.split(" ");
      int[] res = new int[x.length];

      for(int i=0; i<x.length; i++) {
         try {
            res[i] = Integer.parseInt(x[i]);
         } catch (Exception e) {
            System.out.println("Invalid input!\n");
            invalidData = true;
            return res;
         }
      }

      invalidData = false;
      return res;
   }

   public static void main(String[] args) {
      Scanner kbd = new Scanner(System.in);

      System.out.println(" ******************HISTOGRAM MAKER****************** ");
      System.out.println();

      int[] values;
      do {
         System.out.println("Enter in your data, seperated by spaces!");
         values = parseData(kbd.nextLine());
      } while(invalidData);

      System.out.print("Enter in your desired interval size: ");
      int interval = kbd.nextInt();

      kbd.close();

      System.out.println("\n~~~~~~~~~~~~~~~\n");
      Histogram h = new Histogram(interval);
      h.addValues(values);

      h.display();

   }
}
