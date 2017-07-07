package trials;
import java.util.*;
public class MultiplicationTable {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int n;
	System.out.println("enter the num");
	n=in.nextInt();
	for(int i=1;i<=10;i++){
		int b=n*i;
		System.out.println(n+"*"+i+"="+b);}
}
}
