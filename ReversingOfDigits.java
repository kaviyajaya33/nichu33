package trials;
import java.util.*;
public class ReversingOfDigits {
public static void main (String[]args){
	Scanner in=new Scanner(System.in);
	int n,rem;
	n=in.nextInt();
	while(n!=0){
		rem=n%10;
		System.out.print(rem);
		n=n/10;
	}
}
}
