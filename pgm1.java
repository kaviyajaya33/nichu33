package trial;
import java.util.Scanner;
public class pgm1 {
	public static void main(String[]args){
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		n=in.nextInt();
		if(n>0){
			System.out.println("the given is positive");
		}
	 if(n<0){
		System.out.println("the given is negative");
	}
	 if(n==0){
System.out.println("it is zero");
}}}
