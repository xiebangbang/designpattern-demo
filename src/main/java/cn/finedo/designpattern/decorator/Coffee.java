package cn.finedo.designpattern.decorator;

public class Coffee extends Drink{

	@Override
	float cost() {
		return super.getPrice();
	}
	
	@Override
	public String getDescription() {
		return description + getPrice();
	}

}
