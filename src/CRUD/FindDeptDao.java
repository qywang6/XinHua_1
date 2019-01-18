package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class FindDeptDao {
	//查询所有的dept对象信息
	// 该方法返回值是一个集合
	public List<Dept> findAll(){
		//定义一个空的员工集合，用于接收数据库查询迭代的每一个员工对象。
	     List<Dept> depts = new ArrayList<Dept>();
		
		// 连接数据库的url地址
				/* 
				 *  指定要加载的数据库  数据库的地址  数据库的端口号      需要访问的库
				 * jdbc:mysql://       localhost:    3306/               xinhua
				 * */
				String url ="jdbc:mysql://localhost:3306/xinhua";
				// 加载数据库的驱动包
				String driver="com.mysql.jdbc.Driver";
				// 连接数据库的用户名
				String username="root" ;
				// 连接数据库的密码
				String password="root" ;
				// 加载驱动   异常   抛异常   捕获异常
				try {
					Class.forName(driver);
					//获取数据库连接对象 
					/*
					 * getConnection 连接数据库
					 * 第一个参数 请求地址 url
					 * 第二个参数 连接数据库的用户名
					 * 第三个参数 连接数据库的密码
					 * */
					Connection conn = DriverManager.getConnection(url, username, password);
					// 查看是否可以正常打印conn连接对象
					// 如果能正常打印，表明目前配置没有问题，可以正确访问数据库，进行后续的操作
					// 如果不能正常打印，检查代码。 运行通过才能进行后续的操作
					//System.out.println(conn);
					// 查询出所有的部门数据。
					String sql = "select * from dept";
					// ORM 映射  一个实体对象映射表中一行数据。
					//预编译sql语句
					PreparedStatement prep = conn.prepareStatement(sql);
					//接收数据库返回的记录，封装成结果集对象
					ResultSet res = prep.executeQuery();
					// 对返回的结果集进行迭代 ， 迭代就是从res对象中循环的取出数据库的每一行
					// 记录，封装成一个部门对象。
					/*boolean a = res.next();
					boolean a1 = res.next();
					boolean a2 = res.next();
					boolean a3 = res.next();
					boolean a4 = res.next();
					System.out.println(a);
					System.out.println(a1);
					System.out.println(a2);
					System.out.println(a3);
					System.out.println(a4);*/
					
					// while循环如果为true表示有数据，如果为false表示数据已经全部取出。
//					Dept d = null;
					while(res.next()){
					
						/*int deptno = res.getInt("deptno");
						String dname = res.getString("dname");
						String loc =res.getString("loc");*/
						
					/*	int deptno =res.getInt(1);
						String dname = res.getString(2);
						String loc = res.getString(3);*/
						
						//从res结果集中根据表字段名，取出字段值 
						// 迭代的一行记录代表一个dept对象
						//Object是所有对象的基类（父类）
						int deptno = (int)res.getObject("deptno");
						String dname = (String)res.getObject("dname");
						String loc = (String) res.getObject("loc");
						//将取出的数据设置给Dept对象。
						Dept d = new Dept();
						d.setDeptno(deptno);
						d.setDname(dname);
						d.setLoc(loc);
//						System.out.println(d);
						// 将迭代的每一个员工对象，添加到集合中
						depts.add(d);
					}
					
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new RuntimeException("驱动加载失败");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new RuntimeException("数据库连接参数错误");
				}
				return depts;
		
	}
	
	public static void main(String[] args) {
		FindDeptDao deptDao = new FindDeptDao();
		List<Dept> depts = deptDao.findAll();
		//增强型for循环  第一个参数要循环的集合元素类型 
		// 第二个参数是任意变量名，代表当前迭代的元素对象
		// 第三个参数是迭代的集合对象。
		
		for(Dept d:depts){
			System.out.println(d);
		}
	} 
}
