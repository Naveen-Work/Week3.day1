package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test = "I am a software tester";
		String[] str = test.split(" ");

		String newStr = "";
		//String[] odd = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			if (i % 2 != 0) { // Check odd or even index
				String rev = "";
				char[] char1 = str[i].toCharArray(); //String to Char Array

				for (int j = char1.length - 1; j >= 0; j--) {
					rev = rev + char1[j]; //Storing characters in reverse order
				}
				newStr = newStr + rev + " ";
				System.out.print(rev +" ");
			}else {
				newStr = newStr + str[i]+" ";
				System.out.print(str[i] +" ");
			}
			
		}		 
	}

}
