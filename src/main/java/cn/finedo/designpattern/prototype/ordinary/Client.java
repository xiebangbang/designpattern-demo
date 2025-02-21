package cn.finedo.designpattern.prototype.ordinary;

public class Client {
	
	public static void main(String[] args) {
		
		//传统的方法
		Sheep sheep = new Sheep("Tom",1,"白色");
		
		Sheep sheep1 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
		Sheep sheep2 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
		Sheep sheep3 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
		Sheep sheep4 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
		
		System.out.println(sheep);
		System.out.println(sheep1);
		System.out.println(sheep2);
	}

}
