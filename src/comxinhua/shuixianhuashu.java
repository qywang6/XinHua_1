package comxinhua;
import java.util.*;
public class shuixianhuashu {
	
		 /*
		    * public static void main(String[] args) { 
		    * int num = 100; int a[] = new int[3];
		    * System.out.print("3位的水仙花数有：\t"); 
		    * while (num <= 999) { 
		    *         int sum =0; 
		    *         a[0] = num / 100 % 10;
		    *         a[1] = num / 10 % 10; 
		    *         a[2] = num % 10;
		    *  for (int i = 0; i < 3; i++) {
		    *      sum = sum + (int) Math.pow(a[i], 3); 
		    *  } 
		    *  if (num ==sum) { 
		    *      System.out.print(num + "\t"); } num++; 
		    *      } 
		    *  }
		    */
		    public static void main(String[] agrs) {
		        System.out.print("指定最大位数N:");
		        Scanner input = new Scanner(System.in);
		        int N = input.nextInt();
		        input.close();
		        for (int i = 3; i <= N; i++) {
		            int a[] = new int[i];
		            int num = (int) Math.pow(10, i - 1) + 1;
		            System.out.print(i + "位的水仙花数有：\t");
		            while (num <= Math.pow(10, i)) {
		                int sum = 0;
		                for (int j = 0; j < i; j++)
		                    a[j] = (int) (num / Math.pow(10, j) % 10);
		                for (int j = 0; j < i; j++) 
		                    sum = sum + (int) Math.pow(a[j], i);
		                if (num == sum)
		                    System.out.print(num + "\t");
		                num++;
		            }
		            System.out.print("\n");
		        }
		    }
	}

