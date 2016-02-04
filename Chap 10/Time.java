public class Time {
   private int hours;
   private int mins;
   
   public Time(int h, int m) {
      if(h > 24 || h < 0 || m < 0 || m > 60) {
         throw new IllegalArgumentException("Invalid arguments");
      }
      
      hours = h;
      mins = m;
   }

   private int toMins() {
      return hours * 60 + mins;
   }
   
   public boolean lessThan(Time t) {
      return toMins() < (t.hours * 60 + t.mins);
   }

   public int elapsedSince(Time t) {
      int numOfMins = t.hours * 60 + t.mins;
      return Math.abs(numOfMins - toMins());
   }
   
   public String toString() {
      return hours + ":" + mins;
   }
}