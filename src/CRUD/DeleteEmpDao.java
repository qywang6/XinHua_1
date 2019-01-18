package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEmpDao {
	 public void deleteEmp(int empno){
		
		 try {
			 String sql = "delete from emp where empno=?";
			 // 连接数据库
			 Connection conn = DBUtil.getConnection();
			 // 预编译sql语句
			 PreparedStatement prep = conn.prepareStatement(sql);
			 prep.setInt(1, empno);
			 // 执行sql语句
			 int result  = prep.executeUpdate();
			 if(result>0){
				 System.out.println("删除员工成功");
			 }else{
				 System.out.println("没有删除员工");
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 public static void main(String[] args) {
		 DeleteEmpDao deleteDao = new DeleteEmpDao();
		 deleteDao.deleteEmp(7839);
	}
}
