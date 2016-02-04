public Color bestMatch(int r, int g, int b) {
 
   if (r == g && g == b) {
       return Color.GRAY;
   } else if (r > g && r > b) {
       return Color.RED;
   } else if (g > r && g > b) {
       return Color.GREEN;
   } else if (b > r && b > g) {
       return Color.BLUE;
   } else if (g > r && g == b) {
       return Color.CYAN;
   } else if (g > b && g == r) {
       return Color.YELLOW;
   } else {
       return Color.MAGENTA;
   }

}

}