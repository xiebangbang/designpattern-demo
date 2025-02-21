package cn.finedo.designpattern.factory.abstractfactory.pizza;

public class BJCheesePizza extends Pizza{

	@Override
	public void prepare() {
		setName("北京奶酪pizza");
		System.out.println(getName()+"准备原材料");
	}

}
