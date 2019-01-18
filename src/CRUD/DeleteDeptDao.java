package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * B / S  
 *  CRUD ：增删改查    ，查 已经讲完了
 * 
 * */
public class DeleteDeptDao {
	
	// 形参
	public  void deleteDept(int deptno,String danme){
		
		try {
			//?表示未知的参数值
			String sql = "delete from dept where deptno=? and dname=?";
			// 连接数据库
			Connection conn =DBUtil.getConnection();
			// 预编译sql语句
			PreparedStatement prep = conn.prepareStatement(sql);
			//下标从1开始
			prep.setInt(1, deptno);
			prep.setString(2, danme);
			//通过java代码执行sql语句。
			int result = prep.executeUpdate();
			//不需要返回结果集 ，只有查询需要返回结果集（ResultSet）
			if(result>0){
				System.out.println("删除成功"+result);
			}else{
				System.out.println("删除失败"+result);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
//		Connection conn = DBUtil.getConnection();
//		System.out.println(conn);
		DeleteDeptDao deleteDao = new DeleteDeptDao();
		deleteDao.deleteDept(40, "实施部");
	}
}
