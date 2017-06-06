package trial;
import java.util.Scanner;
public class pgm2 {
public static void main(String[]args){
	int n;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number");
	n=in.nextInt();
	if(n%2==0){
		System.out.println("the given number is even");
	}
	else{
	System.out.println("thr given number is odd");
}
}
}