package Regex;

public class User {
     private String name;
     private String firstname;
     private String lastname;
     private String phonenumber;
     private String email;
     private String password;
     private int age;
     private String pincode;
     
     public User(String name, String firstname,String lastname, String phonenumber
    		 ,String email, String password, int age, String pincode)
     {
    	 this.name=name;
    	 this.firstname=firstname;
    	 this.lastname=lastname;
    	 this.phonenumber = phonenumber;
    	 this.email=email;
    	 this.password=password;
    	 this.age=age;
    	 this.pincode=pincode;
     }
     public String getName() { return name; }
     public void setName(String name) { this.name = name; }

     public String getFirstname() { return firstname; }
     public void setFirstname(String firstname) { this.firstname = firstname; }

     public String getLastname() { return lastname; }
     public void setLastname(String lastname) { this.lastname = lastname; }

     public String getPhoneNumber() { return phonenumber; }
     public void setPhoneNumber(String phoneNumber) { this.phonenumber = phonenumber; }

     public String getEmail() { return email; }
     public void setEmail(String email) { this.email = email; }

     public String getPassword() { return password; }
     public void setPassword(String password) { this.password = password; }

     public int getAge() { return age; }
     public void setAge(int age) { this.age = age; }

     public String getPincode() { return pincode; }
     public void setPincode(String pincode) { this.pincode = pincode; }
 }
