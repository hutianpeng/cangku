package service;

import java.util.List;

import entity.LiuTing;

public interface LiuTingService {
	 List<LiuTing> chaxun();
	   int tianji(LiuTing liuting);
	   int shanchu(Integer id);
	   LiuTing id(Integer id);
	   int update(LiuTing liuting);
}
