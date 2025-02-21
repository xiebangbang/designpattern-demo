package cn.finedo.designpattern.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {
	
	private static final long serialVersionID = 1L;
	
	private String name;
	private int age;
	
	public DeepCloneableTarget(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	protected DeepCloneableTarget clone() throws CloneNotSupportedException {
		return (DeepCloneableTarget) super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
