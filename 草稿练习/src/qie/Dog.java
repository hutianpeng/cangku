package qie;

public class Dog extends Pet implements Eatable,FlyingDiscCatchable{

	public Dog(String name, int health, int love) {
		super(name, health, love);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void catchingFlyDisc() {
		System.out.println("�һ�ӷ���");
		
	}

	@Override
	public void eat() {
		System.out.println("�����ڳԷ�");
		
	}

	@Override
	public void print() {
		System.out.printf("����%s �ҵĽ���ֵֵΪ%d �Һ����˵� ���ܶ�Ϊ%d",name,health,love);
		
	}

}
