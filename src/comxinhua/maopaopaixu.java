package comxinhua;

import java.util.Arrays;

public class maopaopaixu {
	public static void main(String[] args){
		int [] arrs={54,43,32,21};
		for(int i=0;i<arrs.length-1;i++){
			for(int j=0;j<arrs.length-1-i;j++){
				if(arrs[j]>arrs[j+1]){
					int temp=arrs[j];
					arrs[j]=arrs[j+1];
					arrs[j+1]=temp;
				}
			}
		}for(int i=0;i<arrs.length-1;i++){
		System.out.println(arrs[i]);
	}
	}
}
