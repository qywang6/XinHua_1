package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class FindDeptDao2 {
	static String url ="jdbc:mysql://localhost:3306/xinhua";
	// 加载数据库的驱动包类名
	static String driver="com.mysql.jdbc.Driver";
	// 连接数据库的用户名
	static String username="root" ;
	// 连接数据库的密码
	static String password="root" ;
	public static Connection getConnection(){
		// try里面代码是正常执行时，调用的代码块
		// catch中代码是当出现异常时，执行的代码块
		try {
			// 加载驱动
			Class.forName(driver);
			//获取数据库连接对象Connection
			Connection conn = DriverManager.getConnection(url, username, password);
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	//查询所有的部门
	public List<Dept> findAllDept(){
		
		try {
			List<Dept>  depts = new ArrayList<Dept>();
			Connection  c = getConnection();
			String sql = "select * from dept";
			// 该对象用于对sql语句在java代码中编译执行
			PreparedStatement prep = c.prepareStatement(sql);
			// 编译之后获取数据库中表的记录，封装成结果集ResultSet
			ResultSet res = prep.executeQuery();
			while(res.next()){//迭代一次获取表中一行记录
				//如果表中有四行记录，那么该循环会迭代四次。
				//此时我们对表中每一行记录用java对象去接收。
				Dept d = new Dept();
				
				//从结果集中获取字段名dname的值。
				String dname =  res.getString("dname");
				d.setDname(dname);
				String loc = res.getString("loc");
				d.setLoc(loc);
				int deptno = res.getInt("deptno");
				d.setDeptno(deptno);
				//每循环一次将部门对象加入到集合中
				depts.add(d);
			}
			
			return depts;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public static void main(String[] args) {
		// com.mysql.jdbc.JDBC4Connection@1a6c5a9e 如果能正常打印，表示该
		// 方法能够正确的访问mysql数据库
		System.out.println(getConnection());
		FindDeptDao2 dao = new FindDeptDao2();
		List<Dept> depts = dao.findAllDept();
		for(int i=0;i<depts.size();i++){
			Dept dept = depts.get(i);
			System.out.println(dept);
		}
		
	}
}

