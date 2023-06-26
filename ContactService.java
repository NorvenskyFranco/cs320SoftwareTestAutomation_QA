package cs320_mobile_app;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
	

		//internal map data structure
	    private Map<String, Contact> contactMap;

	    public ContactService() {
	    	//enforce unique constraint
	        contactMap = new HashMap<>();
	    }

	    public void addContact(String contactID, String firstName, String lastName, String phone, String address) {
	        if (contactMap.containsKey(contactID)) {
	            System.out.println("Contact with ID " + contactID + " already exists.");
	            return;
	        }

	        Contact contact = new Contact(contactID, firstName, lastName, phone, address);
	        contactMap.put(contactID, contact);
	        System.out.println("Contact with ID " + contactID + " added successfully.");
	    }
	    
	    public Contact getContact(String contactID) {
	        return contactMap.get(contactID);
	    }

	    public void deleteContact(String contactID) {
	        if (contactMap.containsKey(contactID)) {
	            contactMap.remove(contactID);
	            System.out.println("Contact with ID " + contactID + " deleted successfully.");
	        } else {
	            System.out.println("Contact with ID " + contactID + " does not exist.");
	        }
	    }
	    //get contact, then change it to new contact with updated information
	    public void updateFirstName(String contactID, String newFirstName) {
	        if (contactMap.containsKey(contactID)) {
	            Contact contact = contactMap.get(contactID);
	            contact = new Contact(contactID, newFirstName, contact.getLastName(), contact.getPhone(), contact.getAddress());
	            contactMap.put(contactID, contact);
	            System.out.println("First name for contact with ID " + contactID + " updated successfully.");
	        } else {
	            System.out.println("Contact with ID " + contactID + " does not exist.");
	        }
	    }
	  //get contact, then change it to new contact with updated information
	    public void updateLastName(String contactID, String newLastName) {
	        if (contactMap.containsKey(contactID)) {
	            Contact contact = contactMap.get(contactID);
	            contact = new Contact(contactID, contact.getFirstName(), newLastName, contact.getPhone(), contact.getAddress());
	            contactMap.put(contactID, contact);
	            System.out.println("Last name for contact with ID " + contactID + " updated successfully.");
	        } else {
	            System.out.println("Contact with ID " + contactID + " does not exist.");
	        }
	    }
	  //get contact, then change it to new contact with updated information
	    public void updatePhone(String contactID, String newPhone) {
	        if (contactMap.containsKey(contactID)) {
	            Contact contact = contactMap.get(contactID);
	            contact = new Contact(contactID, contact.getFirstName(), contact.getLastName(), newPhone, contact.getAddress());
	            contactMap.put(contactID, contact);
	            System.out.println("Phone number for contact with ID " + contactID + " updated successfully.");
	        } else {
	            System.out.println("Contact with ID " + contactID + " does not exist.");
	        }
	    }
	  //get contact, then change it to new contact with updated information
	    public void updateAddress(String contactID, String newAddress) {
	        if (contactMap.containsKey(contactID)) {
	            Contact contact = contactMap.get(contactID);
	            contact = new Contact(contactID, contact.getFirstName(), contact.getLastName(), contact.getPhone(), newAddress);
	            contactMap.put(contactID, contact);
	            System.out.println("Address for contact with ID " + contactID + " updated successfully.");
	        } else {
	            System.out.println("Contact with ID " + contactID + " does not exist.");
	        }
	    }

}
