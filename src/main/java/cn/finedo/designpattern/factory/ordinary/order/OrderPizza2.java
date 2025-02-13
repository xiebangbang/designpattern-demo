package cn.finedo.designpattern.factory.ordinary.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import cn.finedo.designpattern.factory.ordinary.pizza.Pizza;

public class OrderPizza2 {

	Pizza pizza = null;
	String orderType = "";

	public OrderPizza2() {
		do {
			orderType = getType();
			pizza = SimpleFactory.createPizza2(orderType);
			
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

	// 获取客户输入的订购的披萨种类
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza 种类：");
			String str = strin.readLine();
			return str;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

}
