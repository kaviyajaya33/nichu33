package Program;
import java.util.Scanner;
public class logic {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int n=1234,rem;
	while(n!=0){
		rem=n%10;
		System.out.println(rem);
		n=n/10;
	}
		
}
}
