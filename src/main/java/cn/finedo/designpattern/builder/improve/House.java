package cn.finedo.designpattern.builder.improve;

//产品
public class House {

	private String basie;//地基
	private String wall;//砌墙
	private String roofed;//房顶
	public String getBasie() {
		return basie;
	}
	public void setBasie(String basie) {
		this.basie = basie;
	}
	public String getWall() {
		return wall;
	}
	public void setWall(String wall) {
		this.wall = wall;
	}
	public String getRoofed() {
		return roofed;
	}
	public void setRoofed(String roofed) {
		this.roofed = roofed;
	}

}
