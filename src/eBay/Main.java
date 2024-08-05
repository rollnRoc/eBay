package eBay;

import java.util.ArrayList;
import eBay.business.abstracts.CustomerService;
import eBay.business.concretes.CustomerManager;
import eBay.dataAccess.concretes.FinalCustomerDao;
import eBay.entities.concretes.Customer;
import eBay.entities.concretes.Customers;

public class Main {

	public static void main(String[] args) {
		String fName="Emre";
		String lName="Yıldırım";
		String email="asdasdasd";
		String password="qweqweqwe";
		ArrayList<String> emailss = new ArrayList<>();
		emailss.add(email);
		ArrayList<String> passwords = new ArrayList<>();
		passwords.add(password);
		
		
		Customer emre = new Customer(fName,lName,email,password);
	
		
		CustomerService customerService = new CustomerManager(new FinalCustomerDao());
		
		customerService.program(emre,emailss,passwords);

	}

}
