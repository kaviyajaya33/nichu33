package trial;
import java.util.Scanner;
public class power {
	public static void main(String[]args){
		int n,p,r=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the num and power");
		n=in.nextInt();
		p=in.nextInt();
		if(n>=0 && p==0){
			r=1;
		}
		else if(n==0 && p>=0){
			r=0;
		}
		else{
			for(int i=1;i<=p;i++){
				r=r*n;
			}
			System.out.println("power is" +r); 
		}
	}

}
