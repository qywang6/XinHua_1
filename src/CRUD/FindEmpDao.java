package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;



public class FindEmpDao {
	
	public List<Emp> findAll(){
		return null;
	}
	
	public static void main(String[] args) {
		
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/xinhua";
			String driver = "com.mysql.jdbc.Driver";
			String username = "root";
			String password = "root";
			// 加载驱动
			Class.forName(driver);
			//获取数据库连接对象Connection 
			Connection conn = DriverManager.getConnection(url, username, password);
			//System.out.println(conn);
			// 查询所有的员工
			String sql = "select * from emp";
			// 预编译sql语句
			PreparedStatement prep = conn.prepareStatement(sql);
			// 返回一个结果集，用ResultSet对象接收数据库返回的结果集
			ResultSet res = prep.executeQuery();
			Emp emp = null;
			while(res.next()){
				emp = new Emp();
				// 根据表字段名获取表字段值
				int empno = res.getInt("empno");
				String ename = res.getString("ename");
				String job = res.getString("job");
				int mgr = res.getInt("mgr");
				Date hiredate = res.getDate("hiredate");
				double sal = res.getDouble("sal");
				double comm = res.getDouble("comm");
				int deptno = res.getInt("deptno");
				// 将得到的字段值设置给Emp实体对象属性。
				emp.setEmpno(empno);
				emp.setEname(ename);
				emp.setJob(job);
				emp.setMgr(mgr);
				emp.setHiredate(hiredate);
				emp.setSal(sal);
				emp.setCommon(comm);
				emp.setDeptno(deptno);
				System.out.println(emp);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("数据库驱动找不到");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("数据库连接失败");
		}
	}
}
