package cs320_mobile_app;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ContactServiceTest {
	

	
	    private ContactService contactService;

	    @BeforeEach
	    public void setup() {
	        contactService = new ContactService();
	    }

	    @Test
	    public void testAddContact() {
	        contactService.addContact("12345", "John", "Doe", "1234567890", "123 Main St");
	        Assertions.assertEquals("John", contactService.getContact("12345").getFirstName());
	    }

	    @Test
	    public void testDeleteContact() {
	        contactService.addContact("12345", "John", "Doe", "1234567890", "123 Main St");
	        contactService.deleteContact("12345");
	        Assertions.assertNull(contactService.getContact("12345"));
	    }

	    @Test
	    public void testUpdateFirstName() {
	        contactService.addContact("12345", "John", "Doe", "1234567890", "123 Main St");
	        contactService.updateFirstName("12345", "Jane");
	        Assertions.assertEquals("Jane", contactService.getContact("12345").getFirstName());
	    }

	    @Test
	    public void testUpdateLastName() {
	        contactService.addContact("12345", "John", "Doe", "1234567890", "123 Main St");
	        contactService.updateLastName("12345", "Smith");
	        Assertions.assertEquals("Smith", contactService.getContact("12345").getLastName());
	    }

	    @Test
	    public void testUpdatePhone() {
	        contactService.addContact("12345", "John", "Doe", "1234567890", "123 Main St");
	        contactService.updatePhone("12345", "5555555555");
	        Assertions.assertEquals("5555555555", contactService.getContact("12345").getPhone());
	    }

	    @Test
	    public void testUpdateAddress() {
	        contactService.addContact("12345", "John", "Doe", "1234567890", "123 Main St");
	        contactService.updateAddress("12345", "456 Elm St");
	        Assertions.assertEquals("456 Elm St", contactService.getContact("12345").getAddress());
	    }
	}
}
