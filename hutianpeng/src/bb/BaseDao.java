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
	}                                //传递sql语句
	   public static Object execute(String sql,Object...params){
		  //                   调用上面的方法con();
		   try( Connection conn=con();) {
			 //准备语句      
			PreparedStatement pst=conn.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				//补全准备语句          
				pst.setObject(i+1, params[i]);
			}
			if (pst.execute()){//判断结果为 TRUE
				RowSetFactory rsf=RowSetProvider.newFactory();
				//保存行集
				CachedRowSet crs=rsf.createCachedRowSet();
				crs.populate(pst.getResultSet());//将结果集放入行集当中
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
	
