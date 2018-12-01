//Hannah Estes, Katrina Bueno, Mostofa Adib Shakib, Payal Pawar

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please select the program to run, or enter 0 to exit.");
			System.out.println("1: Bank Staff");
			System.out.println("2: Customer");
			System.out.println("0: Exit");
			
			String choice = scanner.nextLine();
			switch(choice){
			case("0"):
				return;
			case("1"):
				BankStaffActions.mainMenu();
				break;
			case("2"):
				CustomerActions.getAccount();
				break;
			default:
				//goto main menu
			}
		}
	}
}
