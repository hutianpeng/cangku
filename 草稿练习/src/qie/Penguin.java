package qie;

public class Penguin extends Pet implements Eatable,Swimmable{

	public Penguin(String name, int health, int love) {
		super(name, health, love);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		System.out.println("�һ���Ӿ");
		
	}

	@Override
	public void eat() {
	System.out.println("�Ұ�����");
	}

	@Override
	public void print() {
		System.out.printf("����%s �ҵĽ���ֵֵΪ%d �Һ����˵� ���ܶ�Ϊ%d",name,health,love);
		
	}

}
