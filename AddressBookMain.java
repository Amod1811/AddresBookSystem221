package bl.com.addressbooksystem;

import java.util.Scanner;

public class AddressBookMain {

	AddressBook addressbook = new AddressBook();
	Scanner sc = new Scanner(System.in);

	public void getmenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu of Address Book");
		boolean check = false;
		do {
			System.out.println("Enter Your Choice" + "\n1. Add Contact" + "\n2. DisplayContact" + "\n3. Edit Contact");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				addressbook.addcontact();
				break;
			case 2:
				addressbook.displayContact();
				break;
			case 3:
				addressbook.editContact();
				break;
			default:
				System.out.println("Enter the valid choice");
			}
		} while (!check);

	}

	public static void main(String[] args) {
		System.out.println("Welcome To Address Book System");
		AddressBookMain addressBook = new AddressBookMain();
		addressBook.getmenu();
		AddressBook addressbook = new AddressBook();
		addressbook.addcontact();
	}

}
