package cn.finedo.designpattern.bridge;

public class Client {

	public static void main(String[] args) {
		
		Phone phone = new FoldedPhone(new XiaoMi());
		phone.open();
		phone.call();
		phone.close();
		
		Phone phone2 = new UpRightPhone(new Vivo());
		phone2.open();
		phone2.call();
		phone2.close();
		
	}

}
