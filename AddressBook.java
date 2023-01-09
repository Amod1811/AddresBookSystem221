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
	}

	public void displayContact() {
		String firstname1=contact.getFirstname();
		System.out.println(firstname1);
		String lastname1 = contact.getLastname();
		System.out.println(lastname1);
		int mobilenumber1 = contact.getMobilenumber();
		System.out.println(mobilenumber1);
		String email1 = contact.getEmail();
		System.out.println(email1);
		String city1 = contact.getCity();
		System.out.println(city1);
		String state1 = contact.getState();
		System.out.println(state1);
		System.out.println(contact);
	}

	public void editContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter original Name to Edit");
		String editName = sc.next();
		if (editName.equalsIgnoreCase(firstname)) {
			addcontact();
		} else {
			System.out.println("Invalid first name");
			System.out.println("Please Enter Valid First Name");
			System.out.println();
			editContact();
		}
	}

}
