package cn.finedo.designpattern.singleton;

/**
 * 饿汉式（静态常量）的应用实例：
 * ①构造器私有化（防止new）
 * ②类的内部创建对象
 * ③向外暴露一个静态的公共方法，如：getInstance
 */
public class Singleton {
	
	private Singleton() {}
	
	private final static Singleton instance = new Singleton();
	
	//提供一个公有的静态方法，返回实例对象
	public static Singleton getInstance() {
		return instance;
	}
	
}
