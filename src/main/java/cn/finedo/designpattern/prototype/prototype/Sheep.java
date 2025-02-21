package cn.finedo.designpattern.prototype.prototype;

public class Sheep implements Cloneable{

	private String name;
	private int age;
	private String color;
	
	public Sheep friend; //是对象，克隆时默认是浅拷贝

	public Sheep() {
		super();
	}

	public Sheep(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	//克隆该实例，使用默认的clone方法来完成。
	@Override
	public Sheep clone() {
		Sheep sheep = null;
		
		try {
			sheep = (Sheep)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return sheep;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Sheep [name=" + name + ", age=" + age + ", color=" + color + "]";
	}
}
