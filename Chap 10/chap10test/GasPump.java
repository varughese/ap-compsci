public class GasPump {
   private static int totalSales = 0;
   private double pricePerGallon;

   public GasPump(double p) {
      pricePerGallon = p;
   }

   public static int getTotalSales() {
      return totalSales;
   }
   
   private double getCost(double gallons) {
      return gallons * pricePerGallon;
   }
   
   private double pump(double gallons) {
      totalSales += getCost(gallons);
      // dispense gas
      return getCost(gallons);
   }
   
   public double fill(Car car) {
      double gallons = car.getTankCapacity() - car.getGasAmt();
      car.addGas(gallons);
      return pump(gallons);
   }
   
   public double fill(Car car, double dollarLimit) {
      double gallons = car.getTankCapacity() - car.getGasAmt();
      double max = gallons / pricePerGallon;
      if(max > dollarLimit) {
         gallons = dollarLimit / pricePerGallon;
      }
      car.addGas(gallons);
      return pump(gallons);
   }
}