package cn.finedo.designpattern.singleton;

/**
 * 饿汉式（静态代码块）
 */
public class Singleton01 {
	
	//1、构造器私有化，外部不能new
	private Singleton01() {}
	
	//2、本类内部创建对象实例
	private static Singleton01 instance;
	
	//3、在静态代码块中，创建单例对象
	static {
		instance = new Singleton01();
	}
	
	//4、提供一个公有的静态方法，返回实例对象
	public static Singleton01 getInstance() {
		return instance;
	}
	
}
