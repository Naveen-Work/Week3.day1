package week3.day2;

public class Palindrome {

	public static void main(String[] args) {

		String name="madam";
		String rev="";
		for (int i = name.length()-1; i >=0; --i) {
			char str=name.charAt(i);			
			rev=rev+str;
		}

		if(rev.equals(name)){
			System.out.println(name+" is Palindrome");
		}else {
			System.out.println(name+" is not a Palindrome");
		}

	}

}
