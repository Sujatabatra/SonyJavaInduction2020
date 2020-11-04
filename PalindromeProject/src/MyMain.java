
import com.sujata.demo.Palindrome;
import com.sujata.demo.PalindromeAddition;
import com.sujata.demo.Reverse;

public class MyMain {

	public static void main(String[] args) {
		Palindrome palindrome=new Palindrome();
		palindrome.setNumber(12343210);
		System.out.println("Is no Palindrome: "+palindrome.isPalindrome());

		Reverse reverse=new Reverse();
		reverse.setNumber(1234);
		System.out.println("Reverse No : "+reverse.getReverseNumber());
		
		
		PalindromeAddition palindromeAddition=new PalindromeAddition();
		palindromeAddition.setNumber1(1221);
		palindromeAddition.setNumber2(789);
		System.out.println("Sum : "+palindromeAddition.getSum());
		
	}

}
