package student;

public class Student {//学生类
	private int on;
	private String name;
	private int age;
	private int java;
	private int c_shar;
	private int html;
	private int sql;
	private int sum;
	private int avg;
	
	public void setOn(int on){
		this.on=on;
	}
	public int getOn(){
		return this.on;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getC_shar() {
		return c_shar;
	}
	public void setC_shar(int c_shar) {
		this.c_shar = c_shar;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public int getSql() {
		return sql;
	}
	public void setSql(int sql) {
		this.sql = sql;
	}
	public int getSum() {
		return sum;
	}
	public void setSum() {
		this.sum=this.java+this.sql+this.html+this.c_shar;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg =this.sum/4;
	}
	public String toString(){
		String msg="\t"+this.on+"\t"+this.name+"\t"+this.age+"\t"+this.java+"\t"
		+this.c_shar+"\t"+this.html+"\t"+this.sql+"\t"+this.sum+"\t"+this.avg;
		return msg;
	}
}










//import java.util.*;
//public class Student {
//	public static void main(String[] args){
//		
//		System.out.println("请输入您要执行的指令");
//		Scanner in=new Scanner(System.in);
//		int num=in.nextInt();
//		String [] stu=new String[]{"张","李","王","赵"};
//		switch(num){
//		case 1:
//			System.out.println("成绩录入");
//			break;
//		case 2:
//			System.out.println("显示成绩");
//			break;	
//		case 3:
//			System.out.println("成绩查询");
//			break;
//		case 4:
//			System.out.println("成绩统计");
//			break;
//		case 5:
//			System.out.println("退出");
//			break;
//			default:
//			System.out.println("谢谢使用");
//		}
//		in.close();
//	}
//}
