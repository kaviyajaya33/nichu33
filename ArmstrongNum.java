package trials;
import java.util.*;
public class ArmstrongNum {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int a,r,sum=0,temp;
	a=in.nextInt();
	temp=a;
	while(a!=0){
		r=a%10;
		sum=sum+(r*r*r);
		a=a/10;}
		if(sum==temp){
			System.out.println("it is an armstrong number");
		}
		else{
			System.out.println("it is not an armstrong number");
		}
	}

}

