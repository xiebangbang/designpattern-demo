package cn.finedo.designpattern.factory.factorymethod.order;

import cn.finedo.designpattern.factory.factorymethod.pizza.BJCheesePizza;
import cn.finedo.designpattern.factory.factorymethod.pizza.BJPepperPizza;
import cn.finedo.designpattern.factory.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		return pizza;
	}
	
}
