package comxinhua;

public class baiwenbaiji {
	public static void main(String[] args){
//		int x=100;int maxa=x/5;
//		for(int a=0;a<=maxa;a++){
//			int maxb=(x-5*a)/3;
//			for(int b=0;b<=maxb;b++){
//				int c=x-a-b;
//				if(c%3!=0)
//					if(a*5+b*3+c/3==100){
//						System.out.println("公鸡数量"+a+"母鸡数量"+b+"小鸡数量"+c);
//
//					}
//				
//			}
//		}
		int money=100;
		for(int a=0;a<=20;a++){
			int money1=money-a*5;
			for(int b=0;b<=money1/3;b++){
				int money2=money1-b*3;
				int c=money2*3;
				if((a+b+c)==100){
					System.out.println("公鸡数量"+a+"母鸡数量"+b+"小鸡数量"+c);
					
				}
			}
		}
	}
}
