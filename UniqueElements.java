package trials;

public class UniqueElements {
public static void main(String[]args){
	int flag=0;
	int a[]=new int[]{1,2,6,9,9,1,3,6,2};
	int b=a.length;
	System.out.println(b);
     for(int i=0;i<a.length;i++){
    	for(int j=0;j<a.length;j++){
    		if(i!=j){
    			if(a[i]!=a[j]){
    				flag=1;
    			}else{
    				flag=0;
    			//break;
    			}
    		}
    	}
    	if(flag==1){
    		System.out.println(a[i]);
    	}
}
}}
