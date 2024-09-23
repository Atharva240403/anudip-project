package sales;

import java.text.ParseException;
import java.util.Scanner;
import static sales.AllOperation.CustomerOrderOperations;
import static sales.AllOperation.ProductOperations;
import static sales.AllOperation.CustomerOperations;
import static sales.AllOperation.SupplierOperations;
public class MainOperation {

	static Scanner scanner = new Scanner(System.in);

	public static  void mainOps() throws ParseException {
		while (true) {
			System.out.println("Welcome to sales and order managment system:");
			
			System.out.println("Press 1. Customer Details\n" + "Press 2. Customer Order Details\n"
					+ "Press 3.  Supplier\n" + "Press 4. Product\n");

			int input = scanner.nextInt();

			switch (input) {
			case 1:
				CustomerOperations();
				System.out.println("=======================================");
				break;

			case 2:
				AllOperation.CustomerOrderOperations();
				System.out.println("=======================================");
				break;

			case 3:
				SupplierOperations();
				System.out.println("=======================================");
				break;

			case 4:
				ProductOperations();
				System.out.println("=======================================");
				break;

			}
		}
	}

	
public static void main (String args[]) throws ParseException {
	mainOps();
} 

}
