package cn.finedo.designpattern.decorator;

public abstract class Drink {
	
	private float price = 0.0f;
	public String description;
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	abstract float cost();
	
}
