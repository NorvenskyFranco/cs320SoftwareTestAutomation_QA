
package cs320_mobile_app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {
	

	    @Test
	    public void testContactCreation() {
	        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
	        Assertions.assertEquals("1234567890", contact.getContactID());
	        Assertions.assertEquals("John", contact.getFirstName());
	        Assertions.assertEquals("Doe", contact.getLastName());
	        Assertions.assertEquals("1234567890", contact.getPhone());
	        Assertions.assertEquals("123 Main St", contact.getAddress());
	    }

	    @Test
	    public void testInvalidContactCreation() {
	        Assertions.assertThrows(IllegalArgumentException.class, () -> {
	            new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St");
	        });

	        Assertions.assertThrows(IllegalArgumentException.class, () -> {
	            new Contact("1234567890", "John", "Doe", "123456789", "123 Main St");
	        });

	        Assertions.assertThrows(IllegalArgumentException.class, () -> {
	            new Contact("1234567890", "John1234567", "Doe", "1234567890", "123 Main St");
	        });

	        Assertions.assertThrows(IllegalArgumentException.class, () -> {
	            new Contact("1234567890", "John", null, "1234567890", "123 Main St");
	        });
	    }
	}
	
}
