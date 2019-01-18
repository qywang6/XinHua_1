package CRUD;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddDeptDao {
	/**
	 * 插入部门到数据库
	 * */
	public void addDept(int deptno,String dname,String loc){
		
		try {
			String  sql = "insert into dept values (?,?,?)";
			Connection conn = DBUtil.getConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			// 分别给sql语句三个?参数赋值
			prep.setInt(1, deptno);
			prep.setString(2, dname);
			prep.setString(3, loc);
			// 执行sql语句
			int result = prep.executeUpdate();
			if(result>0){
				System.out.println("插入部门成功");
			}else{
				System.out.println("插入部门失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void addDept(Dept dept){
		
		try {
			String  sql = "insert into dept values (?,?,?)";
			Connection conn = DBUtil.getConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			// 分别给sql语句三个?参数赋值
			prep.setInt(1, dept.getDeptno());
			prep.setString(2, dept.getDname());
			prep.setString(3, dept.getLoc());
			// 执行sql语句
			int result = prep.executeUpdate();
			if(result>0){
				System.out.println("插入部门成功");
			}else{
				System.out.println("插入部门失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		AddDeptDao addDao = new AddDeptDao();
		Dept d = new Dept();
		d.setDeptno(40);
		d.setDname("实施部");
		d.setLoc("蚌埠");
		//addDao.addDept(30, "售后部", "安庆 ");
		addDao.addDept(d);
	}
}