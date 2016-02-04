import java.util.Scanner;

public class Problem22 
{
   public static void main(String[] args) {
   
    Scanner kbd = new Scanner(System.in);
    
    System.out.print("Enter a number 1-10 (or 0 to quit)");
    int n = Integer.parseInt(kbd.nextLine());  
    
    String line = "";
    
    switch(n) {
      case 1:
         line =  "One, two, Buckle my shoe;";
         break;
      case 2:
         line =  "Three, four, Open the door;";
         break;
      case 3:
         line =  "    Five, six,Pick up sticks;";
         break;
      case 4:
         line =  " Seven, eight,Lay them straight:";
         break;      
      case 5:
         line =  "  Nine, ten, A big, fat hen;";
         break;
                  
      case 6:
         line =  "    Eleven, twelve, Dig and delve;";
         break;    
   
      case 7:
         line =  "Thirteen, fourteen,Maids a-courting;";
         break;   
      case 8:
         line =  "  Fifteen, sixteen, Maids in the kitchen;";
         break;       
      case 9:
         line =  " Seventeen, eighteen, Maids a-waiting";
         break;       
      case 10:
         line =  "Nineteen, twenty, My plate's empty.";
         break;

      default:
         line = "Bye";
         break;
    }
   
   
   
   System.out.println(line);
    
    
   
  

   
   }
   
}