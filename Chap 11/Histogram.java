import java.util.List;
import java.util.ArrayList;

public class Histogram {
   private int interval;
   private ArrayList<Integer> values = new ArrayList<Integer>();
   private int[] freq;
   private int max;
   private String[] bins;
   
   public Histogram(int itrvl) {
      interval = itrvl;
   }
   
   public void addValues(int v) {
      values.add(v);
   }
   
   public void addValues(int[] vals) {
      for(int v:vals) {
         values.add(v);
      }
   }
   
   public static int maxFinder(ArrayList<Integer> arr) {
      int max = -99999;
      for(int n : arr) {
         if(n>max)
            max = n;
      }
      return max;
   }
   
   public String[] createBins(int length) {
      bins = new String[length];
      for(int i=0; i<bins.length; i++) {
         int start = i * interval + 1;
         int end = (i+1) * interval;
         bins[i] = String.format("%02d", start) + " - " + String.format("%02d", end);
      }
      return bins;
   }
   
   public int[] createFrequencies() {
      max = maxFinder(values);
      int topBound = (int)(Math.ceil((double)max / interval)) * interval;
      int length = topBound/interval;
      freq = new int[length];
      createBins(length);
      for(int v : values) {
         int index = (int)((v -.01) / interval);
         freq[index] += 1;
      }
      return freq;
   }

   public String asteriksGenerator(int n) {
      String res = "";
      int i=0;
      while(i<n) {
         res += "*";
         i++;
      }
      return res;
   }

   public void display() {
      createFrequencies();
      for(int i=0; i < bins.length; i++) {
         System.out.printf("%9s  | ", bins[i]);
         System.out.print(asteriksGenerator(freq[i]));
         System.out.println();
      }
   }

   public String toString() {
      return "VALUES: " + values.toString() + " \n"
             + "INTERVAL: " + interval;
   }
}