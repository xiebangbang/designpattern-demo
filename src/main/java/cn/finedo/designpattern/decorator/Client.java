package cn.finedo.designpattern.decorator;

public class Client {

	public static void main(String[] args) {

		//装饰者模式下的订单：2份巧克力 + 一份牛奶 的LongBlack
		//1、先点一份longblack
		Drink order = new LongBlack();
		System.out.println("费用：" + order.cost()+";描述："+order.getDescription());
		
		//2、order 加入一份牛奶
		order = new Milk(order);
		System.out.println("加入一份牛奶后费用：" + order.cost()+";加入一份牛奶后描述："+order.getDescription());
		
		// 3. order 加入一份巧克力
		order = new Chocolate(order);
		System.out.println("加入一份牛奶一份巧克力后费用：" + order.cost()+";加入一份牛奶一份巧克力后描述："+order.getDescription());
		
		// 3. order 再加入一份巧克力
		order = new Chocolate(order);
		System.out.println("加入一份牛奶两份巧克力后费用：" + order.cost()+";加入一份牛奶两份巧克力后描述："+order.getDescription());

		
	}

}
