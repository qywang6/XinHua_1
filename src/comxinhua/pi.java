package comxinhua;

public class pi {
	public static void main(String[] args){
		double sum=0;
		for(double i=1,j=1,m=1;m<=1000000000;i+=2,j*=-1,m++){
			sum+=(1/(double)i)*j;
		}
		double pi=4*sum;
		System.out.println(pi);
	}
}
