package zhangjiabaozaifan;

public class shuixiianhuashu_2 {
	public static void main(String args[]){
	    int i=100;
	    int count=0; //����ˮ�ɻ����ĸ���
	    do{
	      int b = i/100;    //ȡ�ð�λ��
	      int s = (i-100*b)/10;    //ȡ��ʮλ��
	      int g = (i-s*10-b*100);    //ȡ�ø�λ��
	      if(i==g*g*g+s*s*s+b*b*b){ //ˮ�ɻ����ж�
	        System.out.println(i);  //���������������
	        count++;
	      }
	      i+=1;
	    }while(i<1000);
	    System.out.println("ˮ�ɻ����ܹ���"+count+"��");  //���ˮ�ɻ���������
	  }
}