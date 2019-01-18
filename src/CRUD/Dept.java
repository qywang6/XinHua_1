package CRUD;

public class Dept {
	private int deptno;
	private String dname;
	private String loc;
	//给每个属性添加get set方法
	// get表示获取
	// set表示设置
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	// 打印员工对象信息
	public String toString() {
		// TODO Auto-generated method stub
		return "dname="+dname+",deptno="+deptno+",loc="+loc;
	}
	
	public static void main(String[] args) {
		// 模拟创建一个员工对象
		Dept d = new Dept();
		// 设置部门编号
		d.setDeptno(10);
		// 设置部门名称
		d.setDname("研发部");
		// 设置部门地址
		d.setLoc("上海");
		//输出打印部门信息
		System.out.println(d);
	}
}
