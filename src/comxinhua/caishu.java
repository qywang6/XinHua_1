package comxinhua;
import java.util.*;
public class caishu {
	public static void main(String[] args) {
		Random r = new Random();
		int answer = r.nextInt(100);
		System.out.println(answer);
		Scanner sc = new Scanner(System.in);
		System.out.println("请在控制台输入答案:");
		int input =sc.nextInt();
		while(input!=answer){
			if(input==0){
				break;
			}
			if(input>answer){
				System.out.println("猜大了");
			}else{
				System.out.println("猜小了");
			}
			System.out.println("请在控制台输入答案:");
			input =sc.nextInt();
		}
		if(input==answer){
			System.out.println("恭喜你，猜对了，答案是"+input);
		}else{
			System.out.println("主淫，不要离开我");
		}
	}
	
}

