package collection1;
public class Contact {
public long phoneNumber;
public String name;
public String email;
public enum gender {male,female}
public Contact(long phoneNumber, String name, String email) {
	super();
	this.phoneNumber = phoneNumber;
	this.name = name;
	this.email = email;
}
@Override
public String toString() {
	return "Contact [phoneNumber=" + phoneNumber + ", name=" + name + ", email=" + email + "]";
};

}
