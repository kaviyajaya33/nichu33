package trials;
import java.util.*;
public class KthLargest {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int a[]=new int[10];
	int b=a.length;
	System.out.println("enter the height of the student");
	for(int i=0;i<a.length;i++){
		a[i]=in.nextInt();
	}
	Arrays.sort(a);
	System.out.println(a[b-4]);
	System.out.println("enter the position to find the num");
	int k=in.nextInt();
	//System.out.println(a[b-4]);
	System.out.println(a[b-k]);
}
}
