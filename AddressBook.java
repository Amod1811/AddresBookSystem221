package bl.com.addressbooksystem;

import java.util.Scanner;

public class AddressBook {
	ContactPerson contact;
	private String firstname;
	private String lastname;
	private int mobilenumber;
	private String email;
	private String city;
	private String state;

	public void addcontact() {
		contact = new ContactPerson();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name");
		firstname = sc.next();
		System.out.println("Enter the Last Name");
		lastname = sc.next();
		System.out.println("Enter the Mobile Number");
		mobilenumber = sc.nextInt();
		System.out.println("Enter the Email Address");
		email = sc.next();
		System.out.println("Enter the City");
		city = sc.next();
		System.out.println("Enter the State");
		state = sc.next();
		
		contact.setFirstname(firstname);
		contact.setLastname(lastname);
		contact.setMobilenumber(mobilenumber);
		contact.setEmail(email);
		contact.setCity(city);
		contact.setState(state);
		System.out.println("Added Contact successfully");
		System.out.println(contact);
	
	}

	
}
