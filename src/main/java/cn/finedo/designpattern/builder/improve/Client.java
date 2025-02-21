package cn.finedo.designpattern.builder.improve;

public class Client {

	public static void main(String[] args) {
		
		//盖普通房子
		CommonHouse commonHouse = new CommonHouse();
		//准备创建房子的指挥者
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		//返回产品（普通房子）
		House house = houseDirector.constructHouse();
		
		//盖高楼
		HighBuilding highBuilding = new HighBuilding();
		//准备创建房子的指挥者
		HouseDirector houseDirector2 = new HouseDirector(highBuilding);
		//返回产品（高楼）
		House house2 = houseDirector2.constructHouse();
	}
	
}
