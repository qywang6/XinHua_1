package zhangjiabaozaifan;

public class People {
	String name;
	public void listen(Gum gum){
		System.out.println(name+"de qiang sheng");
		gum.shoot();
	}
	public static void main(String[] args){
		People p=new People();
		p.name="xixi";
		p.listen(new Scr());
		p.listen(new Ak47());
		p.listen(new M4());
	}
}
