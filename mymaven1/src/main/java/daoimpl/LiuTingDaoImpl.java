package daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.BaseDao;
import dao.LiuTingDao;
import entity.LiuTing;

public class LiuTingDaoImpl extends BaseDao implements LiuTingDao {

	@Override
	public List<LiuTing> chaxun() {
	     ResultSet rs= (ResultSet) BaseDao.execute("select*from liuting");
	     List<LiuTing> list=new ArrayList<>();
	     if(rs!=null){
	    	 try {
				while(rs.next()){
					 list.add(new LiuTing(rs.getInt(1),rs.getString(2),
							             rs.getInt(3),rs.getString(4)));
				 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }
		return list;
	}

	@Override
	public int tianji(LiuTing liuting) {
		return (int) BaseDao.execute("insert into liuting(id,name,age,school) values(?,?,?,?)",liuting.getId(),
				liuting.getName(),liuting.getAge(),liuting.getSchool());
	
	}

	@Override
	public int shanchu(Integer id) {
		return (int) BaseDao.execute("delete from liuting where id=?",id);
	}

	@Override
	public LiuTing id(Integer id) {
		String sql="select*from liuting where id=?";
		 ResultSet rs=(ResultSet) BaseDao.execute(sql,id);
		 
		 if(rs!=null){
			 try {
				rs.next();
				LiuTing liuting=new LiuTing(rs.getInt(1),rs.getString(2),
						rs.getInt(3),rs.getString(4));
						return liuting;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 }
		return null;
	}

	@Override
	public int update(LiuTing liuting) {
		return	(int) BaseDao.execute("update liuting set name=?,age=?,school=? where id=?",
				liuting.getName(),liuting.getAge(),liuting.getSchool(),liuting.getId());
		
	}

	
	

}
