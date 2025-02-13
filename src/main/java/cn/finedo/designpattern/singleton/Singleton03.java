package cn.finedo.designpattern.singleton;

//懒汉式（线程安全，同步方法）
public class Singleton03 {
	
	private static Singleton03 instance;
	
	private Singleton03() {}
	
	//提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
	public static synchronized Singleton03 getInstance() {
		if(instance == null) {
			instance = new Singleton03();
		}
		return instance;
	}
}
