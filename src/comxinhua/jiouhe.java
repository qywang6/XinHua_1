package comxinhua;

public class jiouhe {
	public static void main(String[] args){
		int sum=0;
		int sum1=0;
		
		for(int i=1;i<=100;i++){
			if(i%2==0){
				sum+=i;
			}else{
				sum1+=i;	
			}
		}
		System.out.println("偶数和"+sum);
		System.out.println("奇数和"+sum1);
	}
}
