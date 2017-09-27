package qie;

public class Dog extends Pet implements Eatable,FlyingDiscCatchable{

	public Dog(String name, int health, int love) {
		super(name, health, love);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void catchingFlyDisc() {
		System.out.println("我会接飞盘");
		
	}

	@Override
	public void eat() {
		System.out.println("狗狗在吃饭");
		
	}

	@Override
	public void print() {
		System.out.printf("我是%s 我的健康值值为%d 我和主人地 亲密度为%d",name,health,love);
		
	}

}
