package cn.finedo.designpattern.singleton;

public class SingletonTest01 {

	public static void main(String[] args) {
		
		//饿汉式（静态变量）测试
//		Singleton instance = Singleton.getInstance();
//		Singleton instance2 = Singleton.getInstance();
//		System.out.println("instance.hashCode="+instance.hashCode());
//		System.out.println("instance2.hashCode="+instance2.hashCode());
		
		//饿汉式（静态代码块）
		Singleton01 instance = Singleton01.getInstance();
		Singleton01 instance2 = Singleton01.getInstance();
		System.out.println("instance.hashCode="+instance.hashCode());
		System.out.println("instance2.hashCode="+instance2.hashCode());
	}

}
