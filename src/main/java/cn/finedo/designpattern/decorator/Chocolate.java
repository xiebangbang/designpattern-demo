package cn.finedo.designpattern.decorator;

//具体的Decorator,这里就是调味品
public class Chocolate extends Decorator{

	public Chocolate(Drink drink) {
		super(drink);
		setDescription("巧克力");
		setPrice(3.0f); //调味品-巧克力的价格
	}

}
