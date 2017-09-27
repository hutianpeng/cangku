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
			//����һ����mybatis-config.xml�ϵ���������
			i = Resources.getResourceAsStream(a);
			//           �ö����𴴽�SqlSessionFactory  ʹ����Ϻ���������  ����ʱ����
			//  build ��������mybatis-config.xml�ļ������ݹ��� SqlSession Factory
			SqlSessionFactory s = new SqlSessionFactoryBuilder().build(i);
			SqlSession sq = s.openSession();
			//SqlSessionFactory  ���ݿ����ӳ�  �������ݿ�����
			//�ö���Ӧ�ñ�֤һ������ֻ��һ�����Ҳ�Ƶ���رգ�����ģʽ�����
			//Spring���������MyBatisʱ���Ѿ����ǵ��˸����⣬�������Ϻ󼴿ɽ��
			//SqlSession ���൱��jdbc�е�Connection���������
			/*Ge user = new Ge();
			user.setName("yyyy");
			user.setPassword("8888");*/
			
			/*Map<String,Object> user=new HashMap<String, Object>();
			user.put("name","qqqq");
			user.put("password","12222");*/
		
			//接口             实现 接口的意�?
			/*GeRepository userDao = sq.getMapper(GeRepository.class);
			//调用保存的方�?
			userDao.save("ww","22");//�������
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
			
			sq.commit();//提交结果      事物
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
