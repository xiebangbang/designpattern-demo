package cn.finedo.designpattern.factory.factorymethod.order;

import cn.finedo.designpattern.factory.factorymethod.pizza.LDCheesePizza;
import cn.finedo.designpattern.factory.factorymethod.pizza.LDPepperPizza;
import cn.finedo.designpattern.factory.factorymethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}
}
