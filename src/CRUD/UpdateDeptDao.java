package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *  1  完成员工表的更新
 *  2  根据部门编号（deptno）查询出一个部门对象
 *  3  根据员工编号（empno）查询出一个员工对象
 *  
 *   建议jdbc的CRUD多写。
 * */
public class UpdateDeptDao {
	/**
	 * 修改部门
	 * */
	public void updateDept(Dept dept){
		
		try {
			String  sql = "update dept set dname=? , loc = ?  where deptno=?";
			Connection conn = DBUtil.getConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			prep.setString(1, dept.getDname());
			prep.setString(2, dept.getLoc());
			prep.setInt(3, dept.getDeptno());
			int result = prep.executeUpdate();
			if(result>0){
				System.out.println("更新部门成功");
			}else{
				System.out.println("更新部门失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		UpdateDeptDao updateDao = new UpdateDeptDao();
		Dept d = new Dept();
		d.setDeptno(10);
		d.setDname("后勤部");
		d.setLoc("安徽");
		updateDao.updateDept(d);
	}
}
