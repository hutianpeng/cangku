package service.impl;

import java.util.List;

import dao.LiuTingDao;
import daoimpl.LiuTingDaoImpl;
import entity.LiuTing;
import service.LiuTingService;

public class LiuTingServiceImpl implements LiuTingService{
     LiuTingDao liutingdao=new LiuTingDaoImpl();
	@Override
	public List<LiuTing> chaxun() {
		   
		return liutingdao.chaxun();
	}

	@Override
	public int tianji(LiuTing liuting) {
		// TODO Auto-generated method stub
		return liutingdao.tianji(liuting);
	}

	@Override
	public int shanchu(Integer id) {
		// TODO Auto-generated method stub
		return liutingdao.shanchu(id);
	}

	@Override
	public LiuTing id(Integer id) {
		// TODO Auto-generated method stub
		return liutingdao.id(id);
	}

	@Override
	public int update(LiuTing liuting) {
		// TODO Auto-generated method stub
		return liutingdao.update(liuting);
	}

}
