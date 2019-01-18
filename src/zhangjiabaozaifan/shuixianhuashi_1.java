package zhangjiabaozaifan;

public class shuixianhuashi_1 {
	public static void main(String args[]){
	    int i=100;
	    int count=0; //定义水仙花数的个数
	    while(i<1000){
	      int b = i/100;    //取得百位数
	      int s = (i-100*b)/10;    //取得十位数
	      int g = (i-s*10-b*100);    //取得个位数
	       
	      if(i==g*g*g+s*s*s+b*b*b){ //水仙花数判定
	        System.out.println(i);  //输出符合条件的数
	        count++;
	      }
	      i+=1;
	    }
	    System.out.println("水仙花数总共有"+count+"个");  //输出水仙花数的总数
	  }

}
