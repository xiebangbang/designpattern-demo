package cn.finedo.designpattern.factory.ordinary.order;

//pizza店，发出订购的订单
public class PizzaStore {

	public static void main(String[] args) {
		
//		new OrderPizza();
		
		//使用简单工厂模式
//		new OrderPizza(new SimpleFactory());
		
		new OrderPizza2();
		
	}
}
