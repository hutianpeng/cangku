package domain;

import java.util.ArrayList;
import java.util.List;

public class Ge {
	private Integer id;
      private String name;
      private String password;
  	private List<Log> logs=new ArrayList<Log>();
  	//如果在一个实体中包含另一个实体的集合，则在Mapper文件中需要使用collection元素
  	//我们将这种称为一对多的映射关系。  一对多映射不需要在数据库中添加额外的列
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
