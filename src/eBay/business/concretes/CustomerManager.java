package eBay.business.concretes;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eBay.business.abstracts.CustomerService;
import eBay.dataAccess.abstracts.CustomerDao;
import eBay.entities.concretes.Customer;
import eBay.entities.concretes.Customers;

public class CustomerManager implements CustomerService {

	private CustomerDao customerDao;

	public CustomerManager(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}

	public static boolean valEmail(String input) {

		String emailRegex = "^(?=.{1,64}@)[A-Za-z0-9\\+_-]+(\\.[A-Za-z0-9\\+_-]+)*@"
				+ "[^-][A-Za-z0-9\\+-]+(\\.[A-Za-z0-9\\+-]+)*(\\.[A-Za-z]{2,})$";
		Pattern emailPat = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPat.matcher(input);
		return matcher.find();
	}

	public void program(Customer customer, ArrayList<String> emailss, ArrayList<String> passwords) {
		int number = 0;

		ArrayList<String> yeniListe = new ArrayList<>();
		ArrayList<String> yeniPwdListe = new ArrayList<>();

		while (true) {

			number = this.customerDao.menu(number);
			if (number == 1) {

				String nameE = this.customerDao.nameE(customer.getfName());
				if (nameE.length() < 3) {
					while (nameE.length() < 3) {
						System.out.println("Name needs to be larger than 2 characters.");
						nameE = this.customerDao.nameE(customer.getfName());
					}
				}
				String lNameE = this.customerDao.lNameE(customer.getlName());
				if (lNameE.length() < 3) {
					while (lNameE.length() < 3) {
						System.out.println("Last Name needs to be larger than 2 characters.");
						lNameE = this.customerDao.lNameE(customer.getlName());

					}
				}
				String qmail = this.customerDao.mail(customer.getEmail());
				if (valEmail(qmail) == false) {
					while (valEmail(qmail) == false) {
						System.out.println("Invalid email! Try again..");
						qmail = this.customerDao.mail(customer.getEmail());
					}
				}
				String pwd = this.customerDao.pw(customer.getPassword());

				if (emailss.contains(qmail)) {
					System.out.println(qmail + " is already in use!\n");

				} else {
					if (pwd.length() < 6) {
						while (pwd.length() < 6) {
							System.out.println("Password needs to be larger than 6 charaters.");
							pwd = this.customerDao.pw(customer.getPassword());
						}
					}
					System.out.println(qmail + " has signed up!\n");
					emailss.add(qmail);
				}

//				for(String emailItem : emailss) {
//					if(emailItem.equals(qmail)) {
//					}
//					else {
//						
//	
//						
//						yeniListe.add(qmail);
//						yeniPwdListe.add(pwd);
//						System.out.println("Email database:"+ yeniListe);
//						System.out.println("Password database:"+ yeniPwdListe+ "\n");
//					}
//				
//			}

			} else if (number == 2) {
				String qmail = this.customerDao.mail(customer.getEmail());
				if (valEmail(qmail) == false) {
					while (valEmail(qmail) == false) {
						System.out.println("Invalid email! Try again..");
						qmail = this.customerDao.mail(customer.getEmail());
					}
				}
				String pwd = this.customerDao.pw(customer.getPassword());
				for (String i : yeniListe) {
					if (i.equals(qmail)) {
						if (yeniPwdListe.indexOf(pwd) != yeniListe.indexOf(qmail)) {
							while (yeniPwdListe.indexOf(pwd) != yeniListe.indexOf(qmail)) {
								System.out.println("Wrond Password, Try Again.");
								pwd = this.customerDao.pw(customer.getPassword());
							}

						}

						System.out.println(qmail + " signed in successfully!\n");

					} else {
						System.out.println(qmail + " not in database. You need to sign up first!\n");

					}

				}
			} else {
				System.out.println("Invalid number.\n");
			}
		}
	}

	@Override
	public int menu(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void signUp(Customer customer) {
		// this.customerDao.mail(customer.getEmail());
		// this.customerDao.pw(customer.getPassword());
		// for(String i : customer.getEmails()) {
		// if(i == customer.getEmail()) {
		// System.out.println(customer.getEmail()+" is already in use!");
		// }
		// else {
		// System.out.println(customer.getEmail()+" has signed up!");
		// customer.getEmails().add(customer.getEmail());
		// customer.getPasswords().add(customer.getPassword());
		// }

		// }

	}

	@Override
	public void signIn(Customer customer) {
		// this.customerDao.mail(customer.getEmail());
		// this.customerDao.pw(customer.getPassword());
		// for(String i : customer.getEmails()) {
		// if(i == customer.getEmail()) {
		// System.out.println(customer.getEmail()+" signed in successfully!");
		// }
		// else {
		// System.out.println(customer.getEmail()+" not in database. You need to sign up
		// first!");

		// }

		// }

	}

	@Override
	public String pw(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mail(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
