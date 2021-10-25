package model;

public class Person {
	private String name;
	private String mail;
	private String address;
	
	public Person(String name, String mail, String address) {
		this.name = name;
		this.mail = mail;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(mail);
		System.out.println(address);
	}
	
	
}
