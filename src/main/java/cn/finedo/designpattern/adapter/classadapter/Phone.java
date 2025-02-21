package cn.finedo.designpattern.adapter.classadapter;

public class Phone {
	
	//充电方法
	public void charging(IVoltage5V iVoltage5V) {
		if(iVoltage5V.output5V() == 5) {
			System.out.println("电压为5V,可以充电~");
		}else {
			System.out.println("电压不是5V,不是可以充电~");
		}
	}

}
