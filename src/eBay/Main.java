package eBay;

import java.util.ArrayList;
import eBay.business.abstracts.CustomerService;
import eBay.business.concretes.CustomerManager;
import eBay.dataAccess.concretes.FinalCustomerDao;
import eBay.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		String fName="Emre";
		String lName="Yıldırım";
		String email="asdasdasd";
		String password="qweqweqwe";
		ArrayList<String> emailss = new ArrayList<>();
		ArrayList<String> passwords = new ArrayList<>();
		
		
		Customer emre = new Customer(fName,lName,email,password);
	
		
		CustomerService customerService = new CustomerManager(new FinalCustomerDao());
		
		customerService.program(emre,emailss,passwords);

	}

}
