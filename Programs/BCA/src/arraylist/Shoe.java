package arraylist;

public class Shoe 
{
	private String brandName;
	private double price;
	private int size;
	private String type;
	
	public Shoe()
	{
		
	}

	public Shoe(String brandName, double price, int size, String type) 
	{
		this.brandName = brandName;
		this.price = price;
		this.size = size;
		this.type = type;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "[brandName=" + brandName + ", price=" + price + ", size=" + size + ", type=" + type + "]";
	}

}