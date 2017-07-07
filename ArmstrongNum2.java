package trials;
import java.util.*;
public class ArmstrongNum2 {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int a,b,temp,r,i,n,count=0;
	System.out.println("enter the start value");
	a=in.nextInt();
	System.out.println("enter the end value");
	b=in.nextInt();
	for( i=a+1;i<=b;i++){
		temp=i;
		n=0;
		while(temp!=0){
			r=temp%10;
			n=n+(r*r*r);
			temp=temp/10;
		}
		if(i==n){
			if(count==0){
				System.out.println("armstrong numbers are:");
			}
			System.out.println(i+" ");
			count++;
		}
		}}
	}

