package cn.finedo.designpattern.composite;

//叶子节点，所以没有add和remove方法
public class Department extends OrganizationComponent{

	public Department(String name, String des) {
		super(name, des);
	}

	@Override
	public void print() {
		System.out.println(getName());
	}
	
}
