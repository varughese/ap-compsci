import javax.swing.JOptionPane;
import java.text.NumberFormat;

/*
*
* @author Mathew Varughese
* TestCalculator class tests RetailPriceCalculator class 
*
*/

public class TestCalculator 
{
	public static void main(String[] args) 
	{
		
      // contained in a for loop to allow continous input
      for( ; ; ) {
      
         // creates formatter which formats numbers into currency
         NumberFormat formatter = NumberFormat.getCurrencyInstance();
   		
         // Opens JOptionPane and stores user input into costInput
   		String costInput = JOptionPane.showInputDialog("Item cost: ");
         // Parses costInput and stores it as a double in 'cost'
   		double cost = Double.parseDouble(costInput);
   		
         // Opens JOptionPane and stores user input into percentageInput
   		String percentageInput = JOptionPane.showInputDialog("Markup percentage \n (Must be in a percentage out of a 100)");
   		// Parses percentageInput and stores it as a double in 'percentage'
         double percentage = Double.parseDouble(percentageInput);
   
   		// creates new RetailPriceCalculator instance called test
         RetailPriceCalculator test = new RetailPriceCalculator();
         
         // Calculates retail price
         // using variables captured above with JOptionPane	
   		double retailPrice = test.calculateRetail(cost, percentage);
   		
         
         // Displays JOptionPane message with markup cost
         
   		// JOptionPane.showMessageDialog method's first parameter is its parent Component,
         // if set as null, a default Frame is used as parent and dialog will be centered on screen
         // (read about java swing library if that doesn't make sense
   
         // formatter.format uses NumberFormat class to format double as currency 
         JOptionPane.showMessageDialog(null, "The retail price is " + formatter.format(retailPrice));
   
      
      }
      			
	}
}