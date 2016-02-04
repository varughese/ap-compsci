import java.util.ArrayList;

public class Chapter11_Problem6 {
   public static ArrayList<Double> getWeightChanges(ArrayList<Double> arr) {
      ArrayList<Double> changes = new ArrayList<Double>();
      
      for(int i=1; i<arr.size(); i++) {
         changes.add(arr.get(i) - arr.get(i-1));
      }
      
      return changes;
   }
   
   public static ArrayList<Double> getWeights(double weight, ArrayList<Double> weightChanges) {
      ArrayList<Double> weights = new ArrayList<Double>();
      weights.add(weight);
      for(double weightChange : weightChanges) {
         weights.add(weights.get(weights.size()-1)+weightChange);
      }
      return weights;
   }
   
   public static ArrayList<Double> getWeightRuns(ArrayList<Double> weights) {
      ArrayList<Double> weightRuns = new ArrayList<Double>();
      
      ArrayList<Double> changes = getWeightChanges(weights);
      
      
      weightRuns.add(changes.get(0));
      boolean changed = false;
      double sum = changes.get(0);
      for(int i=1; i<changes.size(); i++) {
         double n = changes.get(i);
         double p = changes.get(i-1);
         
         if(n * p < 0) {
            weightRuns.add(sum);
            sum = 0;
         }
         
         sum+=n;
      }
      
      weightRuns.remove(0);
      weightRuns.add(sum);
      
      return weightRuns;
   }
   
   public static void main(String[] args) {
      ArrayList<Double> weights = new ArrayList<Double>();
      weights.add(145.0);weights.add(146.5);weights.add(146.5);weights.add(147.0);weights.add(146.0);weights.add(148.0);weights.add(148.5);
      System.out.println(getWeightChanges(weights));
      
      ArrayList<Double> testb = new ArrayList<Double>();
      testb.add(1.5); testb.add(0.0); testb.add(0.5); testb.add(-1.0); testb.add(2.0); testb.add(0.5);
      System.out.println(getWeights(145, testb));
      System.out.println(getWeightRuns(weights));
   }
}