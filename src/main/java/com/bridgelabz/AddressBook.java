package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contact> contactArrayList = new ArrayList<>();
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

        contactArrayList.add(contact);
        System.out.println("\nContact added successfully !");
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
            }
        }
    }

    public void showContacts() {

        if(contactArrayList.size() > 0) {
            for (int i = 0; i < contactArrayList.size(); i++) {
                System.out.println("\n"+contactArrayList);
            }
        }
        else
            System.out.println("No more Contacts !");
    }
}
