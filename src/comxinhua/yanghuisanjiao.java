package comxinhua;
import java.util.*;
public class yanghuisanjiao {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入行数");
		int sum=in.nextInt();
		for(int i=0;i<sum;i++){
			for(int k=0;k<i;k++){
				System.out.print(" ");
			}
			for(int j=0;j<2*(sum-i)-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}

//		for(int i=1;i<=sum;i++){
//			
//			for(int j=1;j<=sum-i;j++){
//				System.out.print(" ");
//			}
//			
//			for(int k=1;k<=2*i-1;k++){
//				System.out.print("*");
//			}
//			System.out.println();
//			}
		
		}
	
	}

