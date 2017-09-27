package qie;

public class Penguin extends Pet implements Eatable,Swimmable{

	public Penguin(String name, int health, int love) {
		super(name, health, love);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		System.out.println("我会游泳");
		
	}

	@Override
	public void eat() {
	System.out.println("我爱吃鱼");
	}

	@Override
	public void print() {
		System.out.printf("我是%s 我的健康值值为%d 我和主人地 亲密度为%d",name,health,love);
		
	}

}
