package domain;

import java.sql.Timestamp;

public class Log {
  private Integer id;
  private Timestamp lastTime;
  private Ge ge;
  //这种称为多对一关联关系，需要在本实体对应的表格中多加一个外键列
  //当出现这种关系时，配置文件中就要书写为association
@Override
public String toString() {
	return "Log [id=" + id + ", lastTime=" + lastTime + "]";
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Timestamp getLastTime() {
	return lastTime;
}
public void setLastTime(Timestamp lastTime) {
	this.lastTime = lastTime;
}
public Ge getGe() {
	return ge;
}
public void setGe(Ge ge) {
	this.ge = ge;
}
public Log(Integer id, Timestamp lastTime, Ge ge) {
	super();
	this.id = id;
	this.lastTime = lastTime;
	this.ge = ge;
}
public Log(Timestamp lastTime, Ge ge) {
	super();
	this.lastTime = lastTime;
	this.ge = ge;
}
public Log() {
	super();
}
  
}
