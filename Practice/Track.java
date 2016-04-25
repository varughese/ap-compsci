public class Track {
   private String name;
   private int duration;
   
   public Track(String nm, int dur) {
      name = nm;
      duration = dur;
   }
   
   public String getName() { return name; }
   public int getDuration() { return duration; }
}