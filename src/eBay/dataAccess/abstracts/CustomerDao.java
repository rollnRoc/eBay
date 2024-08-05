package eBay.dataAccess.abstracts;

import eBay.entities.concretes.Customer;

public interface CustomerDao {
	void signUp(Customer customer);
	void signIn(Customer customer);
	String mail(String gmail);
	String pw(String passw);
	int menu(int number);
	String nameE(String name);
	String lNameE(String lNameE);
}
