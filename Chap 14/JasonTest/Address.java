public class Address implements Comparable<Address>{
   
   private String street;
   private int number;
   
   public int compareTo(Address other){
      int diff1 = street.compareTo(other.street);
      int diff2 = number - other.number;
      if(diff1==0){return diff2;}
      return diff1;
   }
   
   public int equals(Address other){
      if(this.compareTo(other) == 0){return true;}
      return false;
   }
}