package yangdu1;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import domain.Ge;
import domain.Log;
import repository.GeRepository;
import repository.LogRepository;


public class Test {

	@org.junit.Test
	public void test() {
		String a = "mybatis-config.xml";
		InputStream i;
		try {
			//打开了一个在mybatis-config.xml上的输入流；
			i = Resources.getResourceAsStream(a);
			//           该对象负责创建SqlSessionFactory  使用完毕后立即丢弃  起临时作用
			//  build 就是利用mybatis-config.xml文件的内容构造 SqlSession Factory
			SqlSessionFactory s = new SqlSessionFactoryBuilder().build(i);
			SqlSession sq = s.openSession();
			//SqlSessionFactory  数据库连接池  创立数据库链接
			//该对象应该保证一个程序只打开一个，且不频繁关闭，即单模式最合适
			//Spring框架在整合MyBatis时，已经考虑到了该问题，所以整合后即可解决
			//SqlSession 就相当于jdbc中的Connection，随用随关
			/*Ge user = new Ge();
			user.setName("yyyy");
			user.setPassword("8888");*/
			
			/*Map<String,Object> user=new HashMap<String, Object>();
			user.put("name","qqqq");
			user.put("password","12222");*/
		
			//鎺ュ彛             瀹炵幇 鎺ュ彛鐨勬剰鎬?
			/*GeRepository userDao = sq.getMapper(GeRepository.class);
			//璋冪敤淇濆瓨鐨勬柟娉?
			userDao.save("ww","22");//多个参数
			List<Ge> list =userDao.fandAll();
			for(Ge lists:list){
			System.out.println(lists);
			}*/
			Ge ge=new Ge();
			ge.setId(3);
			Log log=new Log();
			log.setGe(ge);
			log.setLastTime(new Timestamp(System.currentTimeMillis()));
			
			
			
			LogRepository l=sq.getMapper(LogRepository.class);
			l.save(log);
			
			List<Log> li =l.fandAll(ge);
			for(Log b:li){
				System.out.print(b);
				System.out.println(ge.getId());
			}
			
			sq.commit();//鎻愪氦缁撴灉      浜嬬墿
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
