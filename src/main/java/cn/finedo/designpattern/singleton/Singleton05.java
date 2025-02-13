package cn.finedo.designpattern.singleton;

//双重检查
public class Singleton05 {
	
	private static volatile Singleton05 instance;
	
	private Singleton05() {}
	
	//提供一个静态的公有方法，加入双重检查代码，解决线程安全问题同时解决懒加载问题并保证了效率，推荐使用
	public static synchronized Singleton05 getInstance() {
		if(instance == null) {
			synchronized(Singleton05.class) {
				if(instance == null) {
					instance = new Singleton05();
				}
			}
		}
		return instance;
	}

}
