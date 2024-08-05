package eBay.entities.concretes;

import java.util.ArrayList;

public class Customers {
	ArrayList<String> emails = new ArrayList<>();
	ArrayList<String> passwords = new ArrayList<>();
	public Customers(ArrayList<String> emails, ArrayList<String> passwords) {
		super();
		this.emails = emails;
		this.passwords = passwords;
	}
	public ArrayList<String> getEmails() {
		return emails;
	}
	public void setEmails(ArrayList<String> emails) {
		this.emails = emails;
	}
	public ArrayList<String> getPasswords() {
		return passwords;
	}
	public void setPasswords(ArrayList<String> passwords) {
		this.passwords = passwords;
	}
}
