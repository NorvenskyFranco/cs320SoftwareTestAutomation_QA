package cs320_mobile_app;

public class Contact {
	
	    private final String contactID;
	    private final String firstName;
	    private final String lastName;
	    private final String phone;
	    private final String address;

	    //constructor for the contact class
	    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
	    	
	    	//perform validation for each of the contact attributes
	        if (contactID == null || contactID.length() > 10) {
	            throw new IllegalArgumentException("Invalid contact ID");
	        }
	        if (firstName == null || firstName.length() > 10) {
	            throw new IllegalArgumentException("Invalid first name");
	        }
	        if (lastName == null || lastName.length() > 10) {
	            throw new IllegalArgumentException("Invalid last name");
	        }
	        if (phone == null || phone.length() != 10) {
	            throw new IllegalArgumentException("Invalid phone number");
	        }
	        if (address == null || address.length() > 30) {
	            throw new IllegalArgumentException("Invalid address");
	        }

	        this.contactID = contactID;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.phone = phone;
	        this.address = address;
	    }
	    //getters for the contacts
	    public String getContactID() {
	        return contactID;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public String getAddress() {
	        return address;
	    }

	  
	    
}

