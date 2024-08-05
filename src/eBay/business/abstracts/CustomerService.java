package eBay.business.abstracts;

import java.util.ArrayList;

import eBay.entities.concretes.Customer;
import eBay.entities.concretes.Customers;

public interface CustomerService {
	int menu(Customer customer);
	void signUp(Customer customer);  //signature
	void signIn(Customer customer);
	String pw(Customer customer);
	String mail(Customer customer);
	void  program(Customer customer, ArrayList<String> emailss,ArrayList<String> passwords);
	
}
