package bb;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class BaseDao {
	private static Connection con(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/hu","hutianpeng","123456");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}                                //����sql���
	   public static Object execute(String sql,Object...params){
		  //                   ��������ķ���con();
		   try( Connection conn=con();) {
			 //׼�����      
			PreparedStatement pst=conn.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				//��ȫ׼�����          
				pst.setObject(i+1, params[i]);
			}
			if (pst.execute()){//�жϽ��Ϊ TRUE
				RowSetFactory rsf=RowSetProvider.newFactory();
				//�����м�
				CachedRowSet crs=rsf.createCachedRowSet();
				crs.populate(pst.getResultSet());//������������м�����
				return crs;
			}else{//fause
				return pst.getUpdateCount();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   return null;
	   }
}
	
