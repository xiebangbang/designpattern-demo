package cn.finedo.designpattern.factory.abstractfactory.order;

import cn.finedo.designpattern.factory.abstractfactory.pizza.Pizza;

public interface AbsFactory {
	
	Pizza createPizza(String orderType);
	
}
