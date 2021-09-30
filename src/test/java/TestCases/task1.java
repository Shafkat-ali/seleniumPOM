package TestCases;

public class task1 {
	
	public static void main(String[] args) {
		
		
		long n = 703888999;
		long temp = n;
	    int sum = 0;
	 
	    // Sum of the first eight
	    // digits of the number
	    while (temp != 0)
	    {
	        sum += temp % 10;
	        temp = temp / 10;
	    }
	 
	    // if sum < 10, then the two digits
	    // are '0' and the value of sum
	    if (sum < 10)
	        System.out.print(n + "0" + sum);
	 
	    // if sum > 10, then the two digits
	    // are the value of sum
	    else
	        System.out.print(n +""+ sum);
	}
		
		
		
		
	

}
