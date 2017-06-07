package trial;
import java.util.Scanner;
public class pgm10 {
public static void main(String[]args){
	int n;
	int count=0;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number");
	n=in.nextInt();
	while(n!=0){
		n/=10;
		count++;
	}
	System.out.println("no of digit"+count);
	
}
}
