package CRUDtest;
import java.sql.*;

import com.mysql.jdbc.MiniAdmin;
public class UpdateDeptDaoTest {
	public void Update(DeptTest depttest){
		try{
			String sql="update dept set dname=?, deptno=? where dloc=?";
			Connection conn=DubtilTest.getConnection();
			PreparedStatement prep=conn.prepareStatement(sql);
			prep.setString(1, depttest.getDname());
			prep.setString(2,depttest.getLoc());
			prep.setInt(3, depttest.getDeptno());
			int result=prep.executeUpdate();
			if(result>0){
				System.out.println("cg");
			}else{
				System.out.println("sb");
			}
		}catch(Exception e){
			
		}
	}
	public static void main(String[] args) {
	UpdateDeptDaoTest updateDao= new UpdateDeptDaoTest();
	DeptTest d=new DeptTest();
	d.setDeptno(10);
	d.setDname("后勤部");
	d.setLoc("guangz");
	updateDao.Update(d);
}
}
