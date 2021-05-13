import java.util.Scanner;

public class numberOfzeroes {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your Number");
	long ip = s.nextInt();
	long r = 0;
	int count = 0;
	r = ip%10;
	ip = ip/10;
	
	while(r == 0) {
		r = ip%10;
		ip = ip/10;
		
			count++;
		
		
	}
	if(count <= 0) {
		System.out.println("Your number does not contain any zeroes on tale ");
	}else {
	System.out.println("There are " + count+ " number of zeros in your number");
	}
}
}
