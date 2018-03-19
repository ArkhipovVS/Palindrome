import java.util.*;

public class Palindrome{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		isPalindrome(s);
	}
	public static String reverseString(String s){
		String r = "";
		for (int i = s.length() - 1; i >= 0; --i)
			r += s.charAt(i);
		return r;        
	}
	public static Boolean isPalindrome(String s) {
		if(s.equals(reverseString(s))){
			System.out.println("is Palindrome");
		}
		else{
			System.out.println("not Palindrome");
		}
		return s.equals(reverseString(s));        
	}
}
