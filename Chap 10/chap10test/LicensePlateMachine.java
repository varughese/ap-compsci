public class LicensePlateMachine {
   public static int plates = 0;
   
   public static int getPlate() {
      plates++;
      return 100000 + plates;
   }
}