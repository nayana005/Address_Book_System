package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook{
	
	ArrayList<Contact> contactArrayList = new ArrayList<>();
	private HashMap<String, ArrayList<Contact>> addresBookSystem = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	// Method to add new contact
	public void addNewContacts() {

		Contact contact = new Contact();
		System.out.println("\nFor adding a new contact enter the following detail");

		System.out.println("\nEnter First Name ");
		contact.setFirstName(sc.nextLine());
		System.out.println("Enter Last Name ");
		contact.setLastName(sc.nextLine());
		System.out.println("Enter Address ");
		contact.setAddress(sc.nextLine());
		System.out.println("Enter Email Id ");
		contact.setEmailId(sc.nextLine());
		System.out.println("Enter City ");
		contact.setCity(sc.nextLine());
		System.out.println("Enter State ");
		contact.setState(sc.nextLine());
		System.out.println("Enter Zip Code ");
		contact.setZipCode(sc.nextInt());
		System.out.println("Enter Phone No. ");
		contact.setPhoneNo(sc.nextInt());

		contactArrayList.add(contact);

		System.out.println("Enter book name");
		sc.nextLine();
		String bookName = sc.nextLine();

		if(addresBookSystem.containsKey(bookName)) {
			ArrayList<Contact> contactList = addresBookSystem.get(bookName);
			addresBookSystem.put(bookName,contactList);
			System.out.println("Contact added successfully exiting book");
		}

		else {
			ArrayList<Contact> contactsArrayList1 = addresBookSystem.get(bookName);
			addresBookSystem.put(bookName, contactsArrayList1);
			System.out.println(bookName + " Created successfully");
			System.out.println("New contact add to the " + bookName);
		}
	}

	public void editContact() {

		System.out.println("Enter the First name of the person");
		String checkFirstName = sc.next();

		for(int i = 0;i < contactArrayList.size();i++)
		{
			if(contactArrayList.get(i).getFirstName().equals(checkFirstName)) {

				System.out.println("\nWhat you want to update");

				System.out.println("\nEnter 1. First Name \nEnter 2. Last Name \nEnter 3.Address " +
						"\nEnter 4. Email id " + "\nEnter 5. City" +
						"\nEnter 6. state \nenter 7. Zip code \nEnter 8.Phone no. \nEnter 9. Exit");
				int num = sc.nextInt();

				switch (num) {

				case 1:
					System.out.println("Enter new first Name");
					contactArrayList.get(i).setFirstName(sc.next());
					break;

				case 2:
					System.out.println("Enter new last name");
					contactArrayList.get(i).setLastName(sc.next());
					break;

				case 3:
					System.out.println("Enter new Address");
					contactArrayList.get(i).setAddress(sc.next());
					break;

				case 4:
					System.out.println("Enter new Email id");
					contactArrayList.get(i).setEmailId(sc.next());
					break;

				case 5:
					System.out.println("Enter new City ");
					contactArrayList.get(i).setCity(sc.next());
					break;

				case 6:
					System.out.println("Enter new State");
					contactArrayList.get(i).setState(sc.next());
					break;

				case 7:
					System.out.println("Enter new Zip code");
					contactArrayList.get(i).setZipCode(sc.nextInt());
					break;

				case 8:
					System.out.println("Enter new Phone No");
					contactArrayList.get(i).setPhoneNo(sc.nextInt());
					break;

				case 9:
					System.out.println("Exit !");
					break;

				default:
					System.out.println("Enter the correct choice !");
					break;
				}
				System.out.println("Contact update successfully !");
				break;
			}
			else
				System.out.println("Contact not founded on " +i +" Position");
		}

	}

	public void deleteContact() {

		if(contactArrayList.size() > 0) {

			System.out.println("Enter the First name of that person which information you want to delete");
			String deletePersonInfo = sc.next();

			for(int i = 0; i < contactArrayList.size(); i++) {

				if (contactArrayList.get(i).getFirstName().equals(deletePersonInfo)) {
					// stored the value of person information in contact ref. variable
					Contact contact = contactArrayList.get(i);
					contactArrayList.remove(contact);
					System.out.println("Contact deleted successfully");
				}
				else
					System.out.println("Wrong input !");
			}
		}
		else
			System.out.println("No more Contact found !");
	}

	public void showContacts() {

		if(contactArrayList.size() > 0) {
			for (int i = 0; i < contactArrayList.size(); i++) {
				System.out.println("\n"+contactArrayList);
				break;
			}
		}
		else
			System.out.println("No more Contacts !");
	}
}

