package trials;
import java.util.*;
public class FactorialOfNum {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int n,f=1;
	System.out.println("enter the num  to find factorial");
	n=in.nextInt();
	for(int i=1;i<=n;i++){
		f=f*i;
	}
	System.out.println("factorial is:"+f);
}
}
