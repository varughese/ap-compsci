public class SoccerTeam {
   private int wins, losses, ties;
   private static int gamesPlayed=0, goalsScored=0;
   public String teamName;
   
   public SoccerTeam(String n) {
      teamName = n;
   }
   
   public void played(SoccerTeam other, int myScore, int otherScore) {
      gamesPlayed++;
      goalsScored += myScore + otherScore;
      int diff = myScore - otherScore;
      if(diff < 0) {
         wins++;
         other.setLosses(other.getLosses()+1);
      } else if( diff > 0) {
         losses++;
         other.setWins(other.getWins()+1);
      } else {
         ties++;
         other.setTies(other.getTies()+1);
      }
   }
   
   public static int getGamesPlayed() {
      return gamesPlayed;
   }
   
   public static int getGoalsScored() {
      return goalsScored;
   }
   
   public static void startTournament() {
      gamesPlayed = goalsScored = 0;
   }
   
   public int getPoints() {
      return wins * 3 + ties;
   }
   
   public void reset() {
      wins = losses = ties = 0;
   }
   
   public int getWins() {
      return wins;
   }
   
   public int getLosses() {
      return losses;
   }
   
   public int getTies() {
      return ties;
   }
   
   public void setWins(int w) {
      wins = w;
   }
   
   public void setLosses(int l) {
      losses = l;
   }
   
   public void setTies(int t) {
      ties = t;
   }
   
   public static void tournyReset(SoccerTeam[] teams) {
      SoccerTeam.startTournament();
      for(SoccerTeam team : teams) {
         team.reset();
      }
   }
   
   public static void main(String[] args) {
      SoccerTeam[] teams = new SoccerTeam[4];
      String[] names = {"A", "B", "C", "D"};
      
      for(int i=0; i<teams.length; i++) {
         teams[i] = new SoccerTeam(names[i]);
      }
      
      for(int i=0; i<teams.length; i++) {
         for(int j=i; j<teams.length; j++) {
            int score1 = (int)(Math.random() * 12);
            int score2 = (int)(Math.random() * 12);
            teams[i].played(teams[j], score1, score2);
         }
      }
      
      System.out.println("TOTAL GOALS: " + SoccerTeam.getGoalsScored() + "\t TOTAL GAMES: " + SoccerTeam.getGamesPlayed() + "\n");
      for(SoccerTeam team : teams) {
         System.out.printf("TEAM NAME: %.3s \t WINS: %.3s \t LOSSES %.3s \t TIES: %.3s %n", team.teamName, team.getWins(), team.getLosses(), team.getTies());
      }
      
      tournyReset(teams);
      
      for(int i=0; i<teams.length; i++) {
         for(int j=i; j<teams.length; j++) {
            int score1 = (int)(Math.random() * 12);
            int score2 = (int)(Math.random() * 12);
            teams[i].played(teams[j], score1, score2);
         }
      }
      
      System.out.println();
      
      
      System.out.println("TOTAL GOALS: " + SoccerTeam.getGoalsScored() + "\t TOTAL GAMES: " + SoccerTeam.getGamesPlayed() + "\n");
      for(SoccerTeam team : teams) {
         System.out.printf("TEAM NAME: %.3s \t WINS: %.3s \t LOSSES %.3s \t TIES: %.3s %n", team.teamName, team.getWins(), team.getLosses(), team.getTies());
      }
      
   }
}