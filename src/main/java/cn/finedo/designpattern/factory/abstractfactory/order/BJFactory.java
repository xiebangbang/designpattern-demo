package cn.finedo.designpattern.factory.abstractfactory.order;

import cn.finedo.designpattern.factory.abstractfactory.pizza.BJCheesePizza;
import cn.finedo.designpattern.factory.abstractfactory.pizza.BJPepperPizza;
import cn.finedo.designpattern.factory.abstractfactory.pizza.Pizza;

public class BJFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~使用的是抽象工厂模式~");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
