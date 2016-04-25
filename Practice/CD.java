import java.util.ArrayList;

public class CD {
   private String title;
   private String band;
   private int numTracks;
   public ArrayList<Track> tracks;
   
   public CD(String t, int n) {
      title = t; numTracks = n;

   }
   
   public CD(String t, String b, int n, ArrayList<Track> songs) {
      title = t; band = b; numTracks = n;
      tracks = new ArrayList<Track>();
      tracks.set(0, new Track("jawn", 12));
     // for(int i=0; i<songs.size(); i++)
     //    tracks.set(i, songs.get(i));
   }
   
   public static void main(String[] args) {
     //  Track tune = new Track("throwing copoper", 13);
//       Track tune2 = new Track("throwing copoper2", 14);
//       ArrayList<Track> s = new ArrayList<Track>();
//       
//       s.add(tune);
//       s.add(tune2);
//       CD x = new CD("jawn", "jawnjawn", 2, s);

      ArrayList<String> s = new ArrayList<String>();
      s.add("A");s.add("B");s.add("C");
      s.set(1, "BB");
      System.out.println(s);
   }
}