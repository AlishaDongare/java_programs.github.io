
import java.io.*; 
import java.util.*; 

public class Ex3 { 

	 
	public static int oneDigit(int num) { 

		if ((num >= 0) && (num < 10)) 
			return 1; 
		else
			return 0; 
	} 

	public static int isPalUtil 
	(int num, int dupNum) throws Exception { 

		if (num == 0) { 
			return dupNum; 
		} else { 
			dupNum = isPalUtil(num / 10, dupNum); 
		} 
 
		if (num % 10 == dupNum % 10) { 
			
			return dupNum / 10; 
		} else { 
		 
			throw new Exception(); 
		} 

	} 

	public static int isPal(int num) 
	throws Exception { 

		if (num < 0) 
			num = (-num); 

		int dupNum = (num); 

		return isPalUtil(num, dupNum); 
	} 

	public static void main(String args[]) { 

		int n = 12421; 
		try { 
			isPal(n); 
			System.out.println("Yes"); 
		} catch (Exception e) { 
			System.out.println("No"); 
		} 
		n = 1231; 
		try { 
			isPal(n); 
			System.out.println("Yes"); 
		} catch (Exception e) { 
			System.out.println("No"); 
		} 

		n = 12; 
		try { 
			isPal(n); 
			System.out.println("Yes"); 
		} catch (Exception e) { 
			System.out.println("No"); 
		} 

		n = 88; 
		try { 
			isPal(n); 
			System.out.println("Yes"); 
		} catch (Exception e) { 
			System.out.println("No"); 
		} 

		n = 8999; 
		try { 
			isPal(n); 
			System.out.println("Yes"); 
		} catch (Exception e) { 
			System.out.println("No"); 
		} 
	} 
} 

