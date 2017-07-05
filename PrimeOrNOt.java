package trial;
import java.util.*;
public class PrimeOrNOt {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int n,count=0;
	n=in.nextInt();
	for(int i=2;i<n;i++){
		if(n%i==0){
			count++;
			break;
		}}
		if(count==0){
			System.out.println("this is a prime number");
		}
		else{
			System.out.println("this is not a prime number");
		}
	}
}

