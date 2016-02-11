public class Animal {
   private int legs;
   private int age;
   private String speak;
   private String name;
   
   public Animal(int l, int a, String s, String n) {
      legs = l; age = a; speak = s; name = n;
   }
   
   public void eat() {
      System.out.println(name + " is eating");
   }
   
   public void speak() {
      System.out.println("Speaking: " + speak);
   }
   
   public static void main(String[] args) {
      Animal x = new Animal(2, 16, "Hello.", "Jason");
      x.eat(); x.speak();
   }
   
   public String getName() {
      return name;
   }
}