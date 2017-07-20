package guvii;
import java.util.*;
public class Lcm {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	System.out.println("enter the 2 num to find HCF");
	int x=in.nextInt();
	int y=in.nextInt();
	int r,a,b,hcf;
	a=x;
	b=y;
	while(b!=0){
		r=a%b;
		a=b;
		b=r;
	}
	System.out.println(a);
	int lcm;
	lcm=(x*y)/a;
	System.out.println(lcm);
}
}
