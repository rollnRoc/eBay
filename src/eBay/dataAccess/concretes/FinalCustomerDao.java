package eBay.dataAccess.concretes;

import java.util.Scanner;

import eBay.dataAccess.abstracts.CustomerDao;
import eBay.entities.concretes.Customer;

public class FinalCustomerDao implements CustomerDao {
	

	
	
	public int menu(int number) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Sign Up\n2. Sign in");
		number = scanner.nextInt();
		return number;
	}
		
	
	public String mail(String gmail) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Email?");
		gmail = scanner.nextLine();
		return gmail;
	}
		
	public String pw(String passw ) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Passwd?");
		passw = scanner.nextLine();
		return passw;
	}
		
	

	@Override
	public void signUp(Customer customer) {
		
	}
	@Override
	public void signIn(Customer customer) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String nameE(String name) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Name?");
		name = scanner.nextLine();
		return name;
	}


	@Override
	public String lNameE(String lNameE) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Last Name?");
		lNameE = scanner.nextLine();
		return lNameE;
		
	}

	

}
