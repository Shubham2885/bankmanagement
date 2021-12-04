package main;

class Adapter {
	
	public void power(String power) {
		System.out.println("Providing the power in AC");
	}
	
	public void power(int power) {
		System.out.println("Providing the power in AC");
	}
}

class Printer extends Adapter {
	
	public void print(String x) {
		System.out.println(x);
	}
	
	public void print(int x) {
		System.out.println(x);	
	}
	
	public void print(double x) {
		System.out.println("double = "+x);
	}
	
	public void print(char x) {
		System.out.println(x);
	}
	
	public void print(float x) {
		System.out.println(x);
	}
	
	@Override
	public void power(String power) {
		System.out.println("Priter converting the AC to DC and work");
	}
	
	@Override
	public void power(int power) {
		super.power(1);
		System.out.println("Priter converting the AC to DC and work");
	}
}

public class PolyDemo {

	public static void main(String[] args) {
		Printer printer = new Printer();
		
		printer.print(6.7);
		
		Adapter adapter = new Printer();
		adapter.power(1);
		
		String str = "sdfhksdj";
		String str2 = "398475";
		
		String str3 = str+str2;
		
		String str1 = new String();
		
		StringBuffer buffer = new StringBuffer();
		
		StringBuilder builder = new StringBuilder();
		buffer.append(str2).append("sdfkksjdlf");
		System.out.println(buffer.toString());
	}
}
