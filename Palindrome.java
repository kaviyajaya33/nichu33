package trial;
import java.util.*;
public class Palindrome {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int a;
	a=in.nextInt();
	int rem=0;
	int temp=a;
	while(a!=0){
		rem=rem*10;	
		rem=rem+(a%10);
		a=a/10;}
		if(rem==temp){
		System.out.println("it is palindrome");
	}
	else{
		System.out.println("it is not a palindrome");
	}}
}
