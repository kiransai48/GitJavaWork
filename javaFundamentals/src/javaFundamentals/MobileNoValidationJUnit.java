package javaFundamentals;
import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;
public class MobileNoValidationJUnit {
	@Before
	public void createBoInstance() {
		MobileNoValidationBO mobileNoValidationBO= new MobileNoValidationBO();
	}
	@Test
	public void testValidMobileNo() {
		MobileNoValidationBO mobileNoValidationBO= new MobileNoValidationBO();
	assertTrue("+919874653210".equals(mobileNoValidationBO.validateMobileNo("+919874653210")));
	
	}
	@Test
	public void testInvalidMobileNo() {
		MobileNoValidationBO mobileNoValidationBO= new MobileNoValidationBO();
		assertTrue("9874653210".equals(mobileNoValidationBO.validateMobileNo("9874653210")));
	}
}
