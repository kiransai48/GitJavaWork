import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class MobileNoValidationJUnit {
    @Before
	public void createBoInstance() {
	MobileNoValidationBO mb= new MobileNoValidationBO();
	mb.getClass();
	}
	@Test
	public void testValidMobileNo() {
		MobileNoValidationBO mb= new MobileNoValidationBO();
	assertEquals("+919874653210", mb.validateMobileNo("+919874653210"));
	}
	@Test
	public void testInvalidMobileNo() {
		MobileNoValidationBO mb= new MobileNoValidationBO();
	assertEquals(equals(mb.validateMobileNo("9874653210")), "9874653210"); 
	}
}
