// Searching is looking for a specific item, pattern recoginition involves finding the best.


public int compareTo(Person other) {
   int diff = getLastName().compareTo(other.getLastName());
   if(diff==0)
      diff = getFirstName().compareTo(other.getFirstName());
      
   return diff;
}