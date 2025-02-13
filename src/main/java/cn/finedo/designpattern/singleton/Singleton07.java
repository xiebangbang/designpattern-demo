package cn.finedo.designpattern.singleton;

//使用枚举，可以实现单例，推荐使用
public enum Singleton07 {

	//这里定义了一个名为Singleton的枚举，并且它只有一个枚举常量INSTANCE。这意味着INSTANCE是这个枚举类的唯一实例。
	INSTANCE;
	
	public void sayOK() {
		System.out.println("ok...");
	}
	
	//使用
	//Singleton07 instance = Singleton07.INSTANCE;
	
}
