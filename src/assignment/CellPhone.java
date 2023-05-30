package assignment;

public class CellPhone {
	private String  brand;
	private long serial_number;
	private double price;
	//private static long serialNumCounter = 1000000;
	
	
//	default  construct
	public CellPhone() {
		brand  = "Apple";
		serial_number  = 123456789;
		price  = 1200;
		}
	
//	parameters  construct
	
	public CellPhone(String br, long sn, double pr) {
		brand =br;
		serial_number = sn;
		price = pr;
		}
	
	
//	copy construct
	public CellPhone(CellPhone c) {
		brand = c.brand;
		serial_number  = c.serial_number;
		price = c.price;
		}
	
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		
		this.brand = brand;
	}

	public long getSerial_number() {
		return serial_number;
	}

	public void setSerial_number(long serial_number) {
		this.serial_number = serial_number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("The cell phone information  is " + brand + "brand "+ " and serial number of "+ serial_number + " and the price is " + price);
	}
	
	 // Method to compare two CellPhone objects for equality
    public boolean equals(CellPhone other) {
        return this.brand.equals(other.brand) && this.price == other.price;
    }

	
	

}
