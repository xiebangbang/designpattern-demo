package cn.finedo.designpattern.singleton;

//懒汉式（线程安全，同步代码块）
public class Singleton04 {

	private static Singleton04 singleton;
	
	private Singleton04() {}
	
	public static Singleton04 getInstance() {
		if(singleton == null) {
			synchronized (Singleton04.class) {
				singleton = new Singleton04();
			}
		}
		return singleton;
	}
}
