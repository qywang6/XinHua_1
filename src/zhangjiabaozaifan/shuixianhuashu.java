package zhangjiabaozaifan;

public class shuixianhuashu {
	public static void main(String[] args){
		 
			    int count = 0;    //����ˮ�ɻ����ĸ���
			    for(int i=100;i<=999;i++){ //ˮ�ɻ�����Χ
			      int b = i/100;    //ȡ�ð�λ��
			      int s = (i-100*b)/10;    //ȡ��ʮλ��
			      int g = (i-s*10-b*100);    //ȡ�ø�λ��
			       
			      if(i==g*g*g+s*s*s+b*b*b){ //ˮ�ɻ����ж�
			        System.out.println(i);  //���������������
			        count++;
			      }
			    }
			    System.out.println("ˮ�ɻ����ܹ���"+count+"��");  //���ˮ�ɻ���������
			  }
	}
