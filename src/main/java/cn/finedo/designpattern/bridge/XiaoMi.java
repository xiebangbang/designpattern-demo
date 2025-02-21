package cn.finedo.designpattern.bridge;

public class XiaoMi implements Brand{

	@Override
	public void open() {
		System.out.println("XiaoMi手机开机");
	}

	@Override
	public void close() {
		System.out.println("XiaoMi手机关机");
	}

	@Override
	public void call() {
		System.out.println("XiaoMi手机打电话");
	}

}
