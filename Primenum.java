package trials;
import java.util.*;
public class Primenum {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int a,b,count=0,i,j;
	System.out.println("enter the start range");
	a=in.nextInt();
	System.out.println("enter the end range");
	b=in.nextInt();
	for(i=a;i<=b;i++){
	 for(j=2;j<i;j++){
		 if(i%j==0){
			 count=0;
			 break;
		 }
		 else
		 {
			 count=1;
		 }}
		 if(count==1){
			 System.out.println(i);
		 }
	 }
	}
}

