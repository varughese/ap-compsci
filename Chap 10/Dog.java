public class Dog extends Animal {
   private String type;
   
   public Dog(String t, int l, int a, String n) {
      super(l, a, "woof", n);
      type = t;
   }
   
   public void speak() {
      System.out.println("Dog specific speaking thing");
   }
   
   public static void main(String[] args) {
      Dog y = new Dog("labrador", 4, 2, "Ralph");
      y.speak();
   }
}