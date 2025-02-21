package cn.finedo.designpattern.builder.improve;

//抽象的建造者
public abstract class HouseBuilder {

	private House house = new House();
	
	//建造的过程都写成抽象的方法
	public abstract void buildBasic();
	public abstract void buildWalls();
	public abstract void roofed();
	
	//将产品返回
	public House buildHouse() {
		return house;
	}
	
}
