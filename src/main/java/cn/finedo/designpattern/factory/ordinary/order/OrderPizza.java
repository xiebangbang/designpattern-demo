package cn.finedo.designpattern.factory.ordinary.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.sql.rowset.RowSetFactory;

import cn.finedo.designpattern.factory.ordinary.pizza.CheesePizza;
import cn.finedo.designpattern.factory.ordinary.pizza.GreekPizza;
import cn.finedo.designpattern.factory.ordinary.pizza.PepperPizza;
import cn.finedo.designpattern.factory.ordinary.pizza.Pizza;

public class OrderPizza {
	
//	//在构造器中根据输入的披萨类型分别制作不同的披萨
//	public OrderPizza() {
//		Pizza pizza = null;
//		String orderType; //订购的披萨类型
//		do {
//			orderType = getType();
//			if(orderType.equals("greek")) {
//				pizza = new GreekPizza();
//				pizza.setName("希腊披萨");
//			}else if(orderType.equals("cheese")) {
//				pizza = new CheesePizza();
//				pizza.setName("奶酪披萨");
//			}else if(orderType.equals("pepper")) {
//				pizza = new PepperPizza();
//				pizza.setName("胡椒披萨");
//			}else {
//				break;
//			}
//			
//			//pizza制作过程
//			pizza.prepare();
//			pizza.bake();
//			pizza.cut();
//			pizza.box();
//			
//		}while(true);
//	}
	
	//定义一个简单工厂对象
	SimpleFactory simpleFactory;
	Pizza pizza = null;
	
	public OrderPizza(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}
	
	public void setFactory(SimpleFactory simpleFactory) {
		String orderType = "";
		this.simpleFactory = simpleFactory;//设置简单工厂对象
		do {
			orderType = getType();
			pizza = this.simpleFactory.createPizza(orderType);
			
			//制作披萨
			if(pizza != null) { //订购成功
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println(" 订购披萨失败 ");
				break;
			}
			
		}while(true);
	}
	
	//获取客户输入的订购的披萨种类
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza 种类：");
			String str = strin.readLine();
			return str;
		}catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	
}
