package trials;
import java.util.*;
public class Subset {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int j,k,count=0;
	System.out.println("enter the size of two arrays");
	j=in.nextInt();
	k=in.nextInt();
	int a[]=new int[j];
	int b[]=new int[k];
	System.out.println("enter the elements for first array");
	for(int i=0;i<j;i++){
		a[i]=in.nextInt();
	}
	System.out.println("enter the elements for second array");
	for(int l=0;l<k;l++){
		b[l]=in.nextInt();
	}
for(int i=0;i<j;i++){
	for(int l=0;l<k;l++){
		if(a[i]==b[l]){
			count++;
		}else{
			count=0;
		}
		/*if(count==1){
			System.out.println("a is the subset of b");
			}else{
				System.out.println("a is not the subset of b");
			}*/
	}
}if(count==1){
	System.out.println("a is the subset of b");
	}else{
		System.out.println("a is not the subset of b");
	}
}
}