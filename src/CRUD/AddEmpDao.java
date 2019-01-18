package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddEmpDao {
	/*public void addEmp(int empno,String ename,String job,...){
		String sql = "insert into emp values "
				+ "(?,?,?,?,?,?,?,?)";
	}*/
	public void addEmp(Emp emp){
		
		try {
			String sql = "insert into emp values "
					+ "(?,?,?,?,?,?,?,?)";
			Connection conn = DBUtil.getConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			prep.setInt(1, emp.getEmpno());
			prep.setString(2, emp.getEname());
			prep.setString(3, emp.getJob());
			prep.setInt(4,emp.getMgr());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			//��ȡ��ǰԱ����ְ��ʱ��
			Date date = emp.getHiredate();
			//������ת��Ϊ�ַ�
			String hiredate = sdf.format(date);
			prep.setString(5,hiredate);
			prep.setDouble(6, emp.getSal());
			prep.setDouble(7, emp.getCommon());
			prep.setInt(8, emp.getDeptno());
			//ִ��sql
			int result = prep.executeUpdate();
			if(result>0){
				System.out.println("新增员工成功");
			}else{
				System.out.println("新增员工失败");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		AddEmpDao addDao = new AddEmpDao();
		Emp emp = new Emp();
		emp.setEmpno(8897);
		emp.setCommon(567.2);
		emp.setDeptno(10);
		emp.setEname("李四");
		emp.setHiredate(new Date());
		emp.setJob("Sale");
		emp.setMgr(7698);
		emp.setSal(6700.5);
		addDao.addEmp(emp);
		
	}
}
