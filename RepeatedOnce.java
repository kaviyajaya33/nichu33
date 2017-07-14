package trials;
import java.util.*;
public class RepeatedOnce {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int n,flag=0;
	System.out.println("enter the size");
	n=in.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=in.nextInt();
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(i!=j){
			if(a[i]!=a[j]){
				flag=1;
				}
			else{
				flag=0;
				break;
			}
		}
	}
		if(flag==1){
			System.out.println(a[i]);
		}
}
}}
