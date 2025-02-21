package cn.finedo.designpattern.factory.factorymethod.pizza;

public class LDCheesePizza extends Pizza{

	@Override
	public void prepare() {
		setName("伦敦奶酪pizza");
		System.out.println(getName()+"准备原材料");
	}

}