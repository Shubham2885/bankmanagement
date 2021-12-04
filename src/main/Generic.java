package main;

public class Generic <Add> {
	
	private Add t;
	
	public Generic(Add t) {
		this.t = t;
	}

	public void print() {
		System.out.println(this.t);
	}
	
//	public <X> void  print(X data){
//		System.out.println(data);
//	}

	public static void main(String[] args) {
		
//		int x = 5;
		//
		
		Student student = new Student("Shubham", "My Address", "4658464");
		
		Generic generic = new Generic(student);
		generic.print();
		//
		
		//
	}
}
