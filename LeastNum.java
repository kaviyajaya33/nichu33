package guviiii;
import java.util.*;
public class LeastNum {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
    int n=in.nextInt();
   int temp;
    int k=in.nextInt();
    String str=Integer.toString(n);
     int m=str.length();
    int a[]=new int[m];
    for(int i=0;i<m;i++){
      a[i]=str.charAt(i)-'0';
      //System.out.println(a[i]);
}
    for(int i=0;i<m;i++){
    	for(int j=i+1;j<m;j++){
    		if(a[i]>a[j]){
    			temp=a[i];
    			a[i]=a[j];
    			a[j]=temp;
    		}
    	}}
    	for(int i=0;i<m-k;i++){
    		System.out.println(a[i]);
    		
    }
   }
}
