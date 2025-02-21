package cn.finedo.designpattern.prototype.prototype;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("使用原型模式完成对象的创建");
		Sheep sheep = new Sheep("Tom",1,"白色");
		sheep.friend = new Sheep("Jack",2,"黑色");
		
		Sheep sheep2 = sheep.clone();
		Sheep sheep3 = sheep.clone();
		Sheep sheep4 = sheep.clone();
		Sheep sheep5 = sheep.clone();
		
		System.out.println("sheep2 = " + sheep2 + "sheep2.friend:"+sheep2.friend.hashCode());
		System.out.println("sheep3 = " + sheep3 + "sheep3.friend:"+sheep3.friend.hashCode());
		System.out.println("sheep4 = " + sheep4 + "sheep4.friend:"+sheep4.friend.hashCode());
		System.out.println("sheep5 = " + sheep5 + "sheep5.friend:"+sheep5.friend.hashCode());

	}

}
