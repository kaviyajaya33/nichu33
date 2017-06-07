package trial;
import java.util.Scanner;
public class pgm9 {
public static void main(String[]args){
	int n=0,i;
	int sum=0;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	n=in.nextInt();
	for(i=0;i<=n;i++){
		sum=sum+i;
		i++;
	}
	System.out.format("sum of the given no.of elements is %d",sum);
}
}
