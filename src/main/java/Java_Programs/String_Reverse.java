package Java_Programs;

public class String_Reverse {
	String st=" ";
	
	public void  rev(String str) {
		for (int i = str.length()-1; i >=0; i--) {
		 System.out.print(str.charAt(i));
		}

	}

	public static void main(String[] args) {
		String_Reverse ob=new String_Reverse();
		ob.rev("Nagbhushan");
//    System.out.println(res);
	}

}
