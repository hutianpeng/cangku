package domain;

import java.util.ArrayList;
import java.util.List;

public class Ge {
	private Integer id;
      private String name;
      private String password;
  	private List<Log> logs=new ArrayList<Log>();
  	//�����һ��ʵ���а�����һ��ʵ��ļ��ϣ�����Mapper�ļ�����Ҫʹ��collectionԪ��
  	//���ǽ����ֳ�Ϊһ�Զ��ӳ���ϵ��  һ�Զ�ӳ�䲻��Ҫ�����ݿ�����Ӷ������
      public List<Log> getLogs() {
		return logs;
	}
	public void setLogs(List<Log> logs) {
		this.logs = logs;
	}

	public Ge() {
		super();
	}
	public Ge(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public Ge(Integer id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Ge [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
      
}
