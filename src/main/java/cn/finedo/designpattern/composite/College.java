package cn.finedo.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{
	
	//list中存放的是Department
	List<OrganizationComponent> organizationComponents = new ArrayList<>();
	
	public College(String name,String des) {
		super(name, des);
	}
	
	@Override
	public void add(OrganizationComponent organizationComponent) {
		//实际业务中，College的add和university的add不一定完全一样
		organizationComponents.add(organizationComponent);
	}
	
	@Override
	public void remove(OrganizationComponent organizationComponent) {
		organizationComponents.remove(organizationComponent);
	}
	
	@Override
	public void print() {
		System.out.println("-------"+getName()+"----------");
		for (OrganizationComponent organizationComponent : organizationComponents) {
			organizationComponent.print();
		}
	}
}
