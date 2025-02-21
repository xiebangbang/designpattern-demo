package cn.finedo.designpattern.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V{

	@Override
	public int output5V() {
		//先获得220v电压
		int srcV = output220V();
		//转成5v
		int dstV = srcV / 44;
		return dstV;
	}

}
