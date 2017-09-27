package domain;

import java.sql.Timestamp;

public class Log {
  private Integer id;
  private Timestamp lastTime;
  private Ge ge;
  //���ֳ�Ϊ���һ������ϵ����Ҫ�ڱ�ʵ���Ӧ�ı���ж��һ�������
  //���������ֹ�ϵʱ�������ļ��о�Ҫ��дΪassociation
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
