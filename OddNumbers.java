package trial;
import java.util.*;
public class OddNumbers {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int a,b;
	System.out.println("enter the start range");
	a=in.nextInt();
	System.out.println("enter the end range");
	b=in.nextInt();
	for(;a<=b;a++){
		if(a%2!=0){
			System.out.println(a);
		}
	}
}
}
