package Repl;

public class TV {
	
	 public double width,length,unitPrice,totalPrice;
	  public boolean isPersian;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public boolean isPersian() {
		return isPersian;
	}
	public void setPersian(boolean isPersian) {
		this.isPersian = isPersian;
	}
	public TV(double width, double length, double unitPrice, double totalPrice, boolean isPersian) {
		super();
		this.width = width;
		this.length = length;
		this.unitPrice = unitPrice;
		this.totalPrice = totalPrice;
		this.isPersian = isPersian;
	}
	
}
