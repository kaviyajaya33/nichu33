package guvii;
import java.util.*;
public class Fibonacci {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	System.out.println("enter the last num");
	int n=in.nextInt();
	int first=0,second=1,third;
	System.out.print(first+" "+second);
	for(int i=2;i<n;i++){
		 third=first+second;
		  System.out.print(" "+third);
		 first=second;
		 second=third;
	
}
}}
