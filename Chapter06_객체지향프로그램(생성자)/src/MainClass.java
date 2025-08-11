// 사원 => Emp
//          empno, ename, job, mgr, hiresate, sal, comm
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import java.util.concurrent.locks.Condition;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@211.238.142.124:1521:XE";
		Condition conn=DriverManager.getConnection(url,"hr",ha);
		String sql="SELECT empno,ename,job,sal,deptno From emp";
		
		PreparedStatement ps=conn.PrepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		int empno=0, sal=0, deptno=0;
		String ename="", job="";
		while(rs.next()) {
			
			empno=rs.getInt(1);
			ename=rs.getString(2);
			job=rs.getString(3);
			sal=rs.getInt(4);
			deptno=rs.getInt(5);
		}
		System.out.println("사번:" + empno);
		System.out.println("이름:" + ename);
		System.out.println("직위:" + job);
		System.out.println("급여:" + sal);
		System.out.println("부서번호:" + deptno);
		
				

	}

}
