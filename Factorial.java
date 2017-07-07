package trials;
import java.util.*;
public class Factorial {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int n,f=1;
	n=in.nextInt();
	for(int i=1;i<=n;i++){
		f=f*i;}
		System.out.println("the factorial is:"+f);
	
}
}
