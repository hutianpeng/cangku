package entity;

public class LiuTing {
	private Integer id;
    private String name;
    private Integer age;
    private String school;
	public LiuTing() {
		super();
	}
	public LiuTing(String name, Integer age, String school) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
	}
	public LiuTing(Integer id, String name, Integer age, String school) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.school = school;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "LiuTing [id=" + id + ", name=" + name + ", age=" + age + ", school=" + school + "]";
	}
    
}
