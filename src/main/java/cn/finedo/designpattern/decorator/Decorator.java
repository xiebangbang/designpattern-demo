package cn.finedo.designpattern.decorator;

public class Decorator extends Drink{

	private Drink drink = null;
	
	public Decorator(Drink drink) {
		this.drink = drink;
	}
	
	@Override
	public String getDescription() {
		return description + " " + getPrice() + drink.getDescription();
	}
	
	@Override
	public float cost() {
		//getPrice() 自己的价格
		return getPrice()+drink.cost();
	}
	
}
