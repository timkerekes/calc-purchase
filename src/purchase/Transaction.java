package purchase;
import java.util.Scanner;

public class Transaction {

	static final double STATE_SALES_TAX = 0.055;
	static final double COUNTY_SALES_TAX = 0.015;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		double totalTax;
		double amountDue;
		double tendered;
		double changeDue;
		
		System.out.println("Please enter the total amount of purchases: $");
		double amount = reader.nextDouble();
		
		totalTax = (amount * STATE_SALES_TAX) + (amount * COUNTY_SALES_TAX);
		
		amountDue = amount + totalTax;
		
		System.out.println("Total of Tax on purchases: $" + totalTax);
		
		System.out.println("Total amount due: $" + amountDue);
		
		System.out.println("Please enter amount of cash tendered: $");
		
		tendered = reader.nextDouble();
		
		reader.close();
		
		changeDue = tendered - amountDue;
		
		System.out.println("Change due: $" + changeDue);
		
	}

}
