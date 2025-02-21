package cn.finedo.designpattern.builder.ordinary;

public abstract class AbstractHouse {

	abstract void buildBasic();
	abstract void buildWalls();
	abstract void roofed();
	
	public void build() {
		//打地基
		buildBasic();
		//砌墙
		buildWalls();
		//封顶
		roofed();
	}
	
}
