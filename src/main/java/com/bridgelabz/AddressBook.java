package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contact> contactsArrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addNewContacts() {

        Contact contact = new Contact();
        System.out.println("\nEnter the following detail");

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

        contactsArrayList.add(contact);
        System.out.println("\nContact added successfully !");
    }

    public void showContacts() {

        if(contactsArrayList.size() > 0) {
            for (int i = 0; i < contactsArrayList.size(); i++) {
                System.out.println("\n"+contactsArrayList);
            }
        }
        else
            System.out.println("No more Contacts !");
    }
}
