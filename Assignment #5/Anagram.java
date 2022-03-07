package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1 = "stops";
		String text2 = "potss";
		int l1=text1.length();
		int l2=text2.length();
		int count=0;
		//a) Check length of the strings are same then (Use A Condition)
		if(l1==l2) {
			//* b) Convert both Strings in to characters
			char[] array1=text1.toCharArray();			
			char[] array2=text2.toCharArray();
			//c) Sort Both the arrays
			Arrays.sort(array1);
			Arrays.sort(array2);
			for (int i = 0; i < l1; i++) {
				if(array1[i]==array2[i]) {
					count++;
				}				
			}

			//d) Check both the arrays has same value
			if(count==l1 && count==l2) {
				System.out.println("Both the arrays has same value");
			}
		}else {
			System.out.println("length of both strings are not equal");
		}




	}

}

/*
 * for (int i = 0; i<l1; i++) { c[i]=text1.charAt(i); d[i]=text2.charAt(i);
 * System.out.println(c[i]+" "+d[i]); }
 */