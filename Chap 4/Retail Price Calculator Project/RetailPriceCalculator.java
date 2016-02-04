/*
*
* @author Mathew Varughese
* RetailPriceCalculator 
*
* Calculates cost of retail value based on percentage
*
*/

public class RetailPriceCalculator 
{
	// Local Data
	// (not entirely neccesary, but here for sake of demonstration)
	double cost;
	double percentage;
	double markupAmount;
	double retailValue;
	
	double calculateRetail(double cost, double percentage) 
	{
		// Sets local data cost to cost argument
		this.cost = cost;
		// Turns percentage into a decimal by dividing by 100
		this.percentage = (percentage/100);

		// Markup amount is the cost multiplied by the percentage increase
		this.markupAmount = this.cost * this.percentage;

		// Retail value is original cost plus the markup amount
		this.retailValue = this.cost + this.markupAmount;

		// returns calculated retail value
		return this.retailValue;
	}
}