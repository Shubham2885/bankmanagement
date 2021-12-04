package main;

import java.util.ArrayList;
import java.util.HashMap;

class Hello {
	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	final public void setUp() {
		
	}
	
}


class Student{
	private String name;
	private String mobileNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Student(String name, String address, String mobileNo) {
		this.name = name;
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", mobileNo=" + mobileNo + "]";
	}
}

class Address{
	private String street;
	private String landmark;
	private String city;
	private String state;
	private int pincode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Address(String street, String landmark, String city, String state, int pincode) {
		super();
		this.street = street;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", landmark=" + landmark + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
	
}

public class Main extends Hello{
	
	private int x;
	static private String str;
	
	static public void print() {
		
	}
	
	public void print1() {
		System.out.println(getString());
	}
	
	private String getString() {
		return "hello";
	}
	
	public static void main(String args[]) {
		
		Main main = new Main();
		Hello hello = new Hello();
		
		Main.print();
		
		main.print1();
		main.getString();
		
		final String str = "sdfsdf";
		
		
		ArrayList<String> strings = new ArrayList<String>();
		
		ArrayList<Integer> intergers = new ArrayList<Integer>();
		
		intergers.add(1);
		intergers.add(2);
		intergers.add(3);
		intergers.add(4);
		intergers.add(5);
		
		System.out.println(intergers);
		strings.add("SHubham1");
		strings.add("SHubham2");
		strings.add("SHubham3");
		strings.add("SHubham4");
		strings.add("SHubham5");
		
		
		
		System.out.println(strings);
		
		for(int i=0;i<strings.size();i++) {
			if(strings.get(i).compareTo("SHubham3") != 0) {
				System.out.println(strings.get(i));
			}
		}
		
		Student student1 = new Student("SHubham1", "address1", "654683135");
		Student student2 = new Student("SHubham2", "address2", "654683135");
		Student student3 = new Student("SHubham3", "address3", "654683135");
		Student student4 = new Student("SHubham4", "address4", "654683135");
		Student student5 = new Student("SHubham5", "address5", "654683135");
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		
		System.out.println(students.get(4).getName());
		
		//advance for loop
		for(Student student : students) {
			System.out.println(student.getName());
		}
		
		int x[] = new int[5];
		
		x[0]=1;
		x[1]=2;
		x[2]=3;
		x[3]=4;
		x[4]=5;
		
		for(int i = 0; i< x.length ; i++) {
			System.out.println(x[i]);
		}
		
//		x[5]=6;
		
		System.out.println("hellwo");
		
		
		HashMap<String, Address> hashMap = new HashMap<String, Address>();
		
		hashMap.put(student1.getName(), new Address("street1", "landmark1", "city1", "state1", 1111));
		hashMap.put(student2.getName(), new Address("street2", "landmark1", "city1", "state1", 1111));
		hashMap.put(student3.getName(), new Address("street3", "landmark1", "city1", "state1", 1111));
		hashMap.put(student4.getName(), new Address("street4", "landmark1", "city1", "state1", 1111));
		hashMap.put(student5.getName(), new Address("street5", "landmark1", "city1", "state1", 1111));
		
		System.out.println(hashMap.get("SHubham3"));
		
		System.out.println(hashMap.keySet());
	}
}