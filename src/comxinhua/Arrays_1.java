package comxinhua;

import java.util.Arrays;
import java.util.Scanner;

//import java.util.*;
//
//
//class Arr1{
//	public static void com() {
//		Scanner in=new Scanner(System.in);
//		System.out.println("请定义数组的长度（5~9）：");
//		int a=in.nextInt();
//		Random r=new Random();
//		int[] arr=new int[a];
//		for(int i=0;i<a;i++){
//			arr[i]=r.nextInt(61)+40;
//		}		
//		paixu(a, arr);
//		System.out.println("电脑随机生成的40~100之间的降序数组为：");
//			System.out.print(Arrays.toString(arr));	
//	}
//	public static int[] paixu(int a,int[] arr){
//		int temp=0;
//		for(int i=1;i<a;i++){
//			for(int j=0;j<a-i;j++){
//				if(arr[j]<arr[j+1]){
//					temp=arr[j+1];
//					arr[j+1]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		return arr;
//	}
//}
//public class Arrays1 {
//	public static void main(String[] args){
//		Arr1 A=new Arr1();
//		A.com();	
//	}
//}
/**
 * 从控制台输入一个5~9之间的数字，生成一个该数字长度的数组。
 *   里面的元素随机生成，范围是40~100，并对生成的数组按从大到小
 *   的顺序进行排序 (定义一个方法去完成，在main方法中调用该方法)
 * */
public class Arrays_1 {
	public static void main(String[] args) {
		int input = inputNum();
		int [] arrs = randomArray(input);
		System.out.println(Arrays.toString(arrs));
	}
	// 该方法用于生成5~9范围的随机数
	public static int inputNum(){
		Scanner sc = new Scanner(System.in);
		int input =0;
		do{
			System.out.println("请输入一个5~9之间的数:");
			input = sc.nextInt();
		}while(input<5||input>9);
		return input;
	}
	
	public  static int[] randomArray(int input){//5
		int [] arrs = new int[input];
		//Math.random()*60 生成0~60之间的任意小数 
		// (int)(Math.random()*60)强转之后生成的是0~60之间的整数
		for(int i=0;i<input;i++){
			arrs[i] =(int)(Math.random()*61)+40;
		}
		int max = 0;
		for(int i=0;i<arrs.length-1;i++){
			for(int j=0;j<arrs.length-1-i;j++){
				if(arrs[j]<arrs[j+1]){
					max = arrs[j+1];
					arrs[j+1]=arrs[j];
					arrs[j]=max;
				}
			}
		}
		
		return arrs;
	}
}
