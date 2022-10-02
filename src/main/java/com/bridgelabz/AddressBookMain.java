package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        System.out.println("Welcome to Address Book System ");
	Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while(!exit) {
        System.out.println("\nEnter 1. Add new Contact \nEnter 2. Edit Contact " +
                "\nEnter 3. Show Contacts \nEnter 4. Delete Contact \nEnter 5. Exit");
        int num = sc.nextInt();

            switch (num) {

                case 1:
                    addressBook.addNewContacts();
                    break;

                case 2:
                    addressBook.editContact();
                    break;
                    
                case 3:
                    addressBook.showContacts();
                    break;
                    
                case 4:
                    addressBook.deleteContact();
                    break;

                case 5:
                    System.out.println("Exit !");
                    exit = true;
                    break;

                default:
                    System.out.println("Enter the correct number !");
                    break;
            }
        }
    }
	
}
