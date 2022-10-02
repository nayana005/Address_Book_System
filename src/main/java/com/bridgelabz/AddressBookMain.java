package com.bridgelabz;

public class AddressBookMain {

	public static void main(String[] args) {

		AddressBook addressBook = new AddressBook();
		System.out.println("Welcome to Address Book System ");
		addressBook.addNewContacts();
		addressBook.showContacts();
	}
}
