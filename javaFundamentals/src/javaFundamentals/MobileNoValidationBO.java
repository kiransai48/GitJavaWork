package javaFundamentals;
public class MobileNoValidationBO {
		public String validateMobileNo(String mobileNo) {
			StringBuilder s = new StringBuilder(mobileNo);
			if(s.indexOf("+91") == 0 && s.substring(3).length() == 10)
	            return "Valid Mobile No: "+mobileNo;
	    	return "Invalid Mobile No: "+mobileNo;
		}
	}


