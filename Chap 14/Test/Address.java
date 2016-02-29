public class Address implemenets Comparable<Address> {
   private String street;
   private int number;
   
   public int compareTo(Address other) {
      int diff = street.compareTo(other.street);
      if(diff == 0) {
         diff = number.compareTo(other.number);
      }
      return diff;
   }
   
   public boolean equals(Object other) {
      return ((Address)other).street.equals(street) && ((Address)other).number.equals(number);
   }
}