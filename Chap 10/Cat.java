public class Cat extends Animal {
   private int whiskers;
   
   public Cat(int w, int l, int a, String n) {
      super(l, a, "meow", n);
      whiskers = w;
   }
   
   public void speak() {
      super.speak();
      System.out.println("--- From " + getName());
   }
   
   public void catSpecific() {
      System.out.println("Only the cat can do this action!");
   }
   
   public static void main(String[] args) {
      Animal y = new Cat(53, 4, 2, "Fido");
      /// y.catSpecific(); // will throw error
      
      Cat w = new Cat(2, 4, 2, "Pal");
      w.catSpecific(); // wont throw error
   }
}