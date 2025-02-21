package cn.finedo.designpattern.factory.abstractfactory.pizza;

public class LDPepperPizza extends Pizza{

	@Override
	public void prepare() {
		setName("伦敦胡椒pizza");
		System.out.println(getName()+"准备原材料");
	}

}
