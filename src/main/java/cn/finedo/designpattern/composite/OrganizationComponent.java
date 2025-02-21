package cn.finedo.designpattern.composite;

public abstract class OrganizationComponent {

	private String name; //名字
	private String des; //说明
	
	public OrganizationComponent(String name, String des) {
		super();
		this.name = name;
		this.des = des;
	}

	public void add(OrganizationComponent organizationComponent) {
		//默认实现
	}
	
	public void remove(OrganizationComponent organizationComponent) {
		//默认实现
	}
	
	//打印的方法，抽象方法，子类都需要实现
	public abstract void print();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
	
}
