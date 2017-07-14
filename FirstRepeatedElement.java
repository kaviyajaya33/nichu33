package trials;
import java.util.*;
public class FirstRepeatedElement {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int n,i,j;
	int count=0;
	System.out.println("enter the size");
	n=in.nextInt();
	int a[]=new int[n];
	for(i=0;i<n;i++){
		a[i]=in.nextInt();}
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(a[i]==a[j]){
				System.out.println("the first repeated element:"+a[i]);
			
			}}break;
	}
		}
	}


