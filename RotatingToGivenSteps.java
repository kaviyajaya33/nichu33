package guviiii;
import java.util.*;
public class RotatingToGivenSteps {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	System.out.println("enter the no.of elements");
	int n=in.nextInt();
    int a[]=new int[n];
    System.out.println("enter the elements");
    for(int i=0;i<n;i++){
    	a[i]=in.nextInt();
    }
    System.out.println("enter the no.of rotate");
    int k=in.nextInt();
    for(int i=k;i<n;i++){
    	System.out.print(a[i]+" ");
    }
    for(int i=0;i<k;i++){
    	System.out.print(a[i]+" ");
    }
}
}
