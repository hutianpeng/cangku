package qie;

public abstract class Pet {
         String name;
         int health;
         int love;
         public abstract void print();//���������Ϣ
		public Pet(String name, int health, int love) {
			super();
			this.name = name;
			this.health = health;
			this.love = love;
		}
}
