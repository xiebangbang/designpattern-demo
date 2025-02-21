package cn.finedo.designpattern.adapter.objectadapter;

public class VoltageAdapter implements IVoltage5V{

	private Voltage220V voltage220v;
	
	public VoltageAdapter(Voltage220V voltage220v) {
		this.voltage220v = voltage220v;
	}
	
	@Override
	public int output5V() {
		//先获得220v电压
		int srcV = voltage220v.output220V();
		//转成5v
		int dstV = srcV / 44;
		return dstV;
	}

}
