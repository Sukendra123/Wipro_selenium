package ProgramsOopsDay3;

public class ShopProductsMain {
	public static void main(String[] args) {
		ShopProductsExample[] items = {
	           new ShopProductsExample("Laptop", 50000, 1),
	           new ShopProductsExample("Mouse", 500, 2),
	           new ShopProductsExample("Keyboard", 1000, 1)};
	       double grandTotal = 0;
	       System.out.println("Product\tPrice\tQty\tTotal");
	       System.out.println("--------------------------------------");
	       for (ShopProductsExample item : items) {
	           item.displayItem();
	           grandTotal += item.getTotalPrice();
	       }
	       System.out.println("--------------------------------------");
	       System.out.println("Grand Total: " + grandTotal);
	   }
	}

	       


