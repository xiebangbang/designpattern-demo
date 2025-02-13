package cn.finedo.designpattern.singleton;

public class Singleton02 {
	
	private static Singleton02 instance;
	
	private Singleton02() {}
	
	//提供一个静态的公有方法，当使用到该方法时，才去创建instance,即懒汉式
	public static Singleton02 getInstance() {
		if(instance == null) {
			instance = new Singleton02();
		}
		return instance;
	}

}
