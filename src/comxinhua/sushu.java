package comxinhua;
import java.util.*;
public class sushu {
	public static void main(String[] args){
		System.out.println("请输入一个整数：");
		Scanner in=new Scanner(System.in);
		int input = in.nextInt();
		// 求出输入数范围内的所有素数
		// 因为2是一个素数，所以一开始统计时让其count值为1。
		int count =1;
		// 素数就是除一之外不能被其他数整数  71
		outer:
		for(int i=3;i<=input;i++){//13
			for(int j=2;j<i;j++){//30
				if(i%j==0){//拿迭代输入的值和除1以及自己本身之外的任何一个
					//数，进行取余运算。如果结果等于0说明该数不是一个素数。否则是一个
					//素数
					continue outer;
				}
			}
			System.out.println(i);
			count++;
			
		}
		System.out.println("素数的个数为:"+count);
	}
}
