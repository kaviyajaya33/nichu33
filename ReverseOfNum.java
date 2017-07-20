package guvii;
import java.util.*;
public class ReverseOfNum {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int rem;
	while(n!=0){
		rem=n%10;
		System.out.print(rem);
	    n=n/10;} 
}
}
