package ProgramsOopsDay3;

public class ShopProductsExample {
	private String productName;
	   private double price;
	   private int quantity;
	   public ShopProductsExample(String productName, double price, int quantity) {
	       this.productName = productName;
	       this.price = price;
	       this.quantity = quantity;
	   }
	   // Calculate total price for the item
	   public double getTotalPrice() {
	       return price * quantity;
	   }
	   // Display item details
	   public void displayItem() {
	       System.out.println(productName + "\t" + price + "\t" + quantity + "\t" + getTotalPrice());
	   }
	}
	


