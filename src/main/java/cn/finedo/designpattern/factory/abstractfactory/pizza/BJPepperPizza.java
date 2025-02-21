package cn.finedo.designpattern.factory.abstractfactory.pizza;

public class BJPepperPizza extends Pizza{

	@Override
	public void prepare() {
		setName("北京胡椒pizza");
		System.out.println(getName()+"准备原材料");
	}

}
