package Regex;

public class Validator {
    public static boolean isValidName(String name) {
    	return name.matches("^[A-Za-z]{2,30}$");
    }
    public static boolean isValidPhone(String phone) {
    	return phone.matches("^[6-9]\\d{9}$");
    }
    public static boolean isValidEmail(String email) {
    	return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
    
}

