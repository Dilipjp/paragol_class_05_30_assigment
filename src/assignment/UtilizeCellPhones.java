package assignment;

public class UtilizeCellPhones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CellPhone c1 = new CellPhone("Samsung",111111111,1200);

		CellPhone c2 = new CellPhone("Apple",222222222,1800);
		
		CellPhone c3 = new CellPhone("OnePlus",333333333,8000);
		
		System.out.println("c1 info:");
		c1.showInfo();
		
		System.out.println("c2 info:");
		c2.showInfo();
		
		System.out.println("c3 info:");
		c3.showInfo();
		
		
		
	
		c1.setPrice(1205);
		c2.setBrand("HTC");
		c3.setSerial_number(333333334);
		
		
		System.out.println("c11 info:");
		c1.showInfo();
		
		System.out.println("c22 info:");
		c2.showInfo();
		
		System.out.println("c33 info:");
		c3.showInfo();
	}

}
