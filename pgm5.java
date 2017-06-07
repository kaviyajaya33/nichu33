package trial;
import java.util.Scanner;
public class pgm5 {
public static void main(String[]args){
	int x,y,z;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the value for x,y,z");
	x=in.nextInt();
	y=in.nextInt();
	z=in.nextInt();
	if(x>y&&x>z){
		System.out.format("%d is the largest number",x);
	}
	else if(y>z){
		System.out.format("%d is the largest number",y);
	}
	else{
		System.out.format("%d is the largest number",z);
	}
}
}
