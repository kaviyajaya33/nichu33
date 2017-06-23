package trial;
import java.util.*;
public class hunter1 {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter the no.of elements");
		n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter the elements");
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					System.out.println(a[i]);
				}}}
		
	}

}
