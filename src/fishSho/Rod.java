package fishSho;

public class Rod {
     private String brand;
     private int closedSize;
     private int numberOfRings;
	public Rod() {
		super();
	}
	public Rod(String brand, int closedSize, int numberOfRings) {
		super();
		this.brand = brand;
		this.closedSize = closedSize;
		this.numberOfRings = numberOfRings;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getClosedSize() {
		return closedSize;
	}
	public void setClosedSize(int closedSize) {
		this.closedSize = closedSize;
	}
	public int getNumberOfRings() {
		return numberOfRings;
	}
	public void setNumberOfRings(int numberOfRings) {
		this.numberOfRings = numberOfRings;
	}
     
}
