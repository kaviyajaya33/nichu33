package trial;
import java.util.Scanner;
public class pgm8 {

	public static void main(String[] args) {
		int n=1,x;
		int sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no.of element");
		x=in.nextInt();
		while(n<=x){
			sum=sum+n;
			n++;
		}
		System.out.format("sum of given no of element is %d",sum);

	}

}
