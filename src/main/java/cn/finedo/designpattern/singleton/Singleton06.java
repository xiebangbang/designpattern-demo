package cn.finedo.designpattern.singleton;

//静态内部类完成，推荐使用
public class Singleton06 {

	private static volatile Singleton06 instance;
	
	private Singleton06() {}
	
	//写一个静态内部类，该类中有一个静态属性 Singleton
	private static class SingletonInstance{
		private static final Singleton06 INSTANCE = new Singleton06();
	}
	
	//提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
	public static synchronized Singleton06 getInstance() {
		return SingletonInstance.INSTANCE;
	}
	
}
