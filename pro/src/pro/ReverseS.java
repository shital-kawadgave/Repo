package pro;

public class ReverseS {

	public static void main(java.lang.String[] args) {
		String name = "Shital";
		int length = name.length();
		String rev = "";
			for(int i= length-1; i>=0; i--) {
			rev = rev + name.charAt(i);
	   }
	System.out.println("Reverse of "+name+" is "+rev);
	

	
	
	
	}}




