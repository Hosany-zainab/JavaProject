import java.util.Scanner;
/**
 * 
 */

/**
 * @author user
 *
 */
public class testbook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key= new Scanner(System.in);
		
		double discounted;
		
		System.out.println("Enter the price");
		double price = key.nextDouble();
		
		System.out.println("Enter the discount");
		int discount = key.nextInt();
		
		
		book b1 = new book();
		b1.setPrice(price);
		b1.setDiscount(discount);
		 
		discounted = b1.calculateDiscount(b1.getPrice(), b1.getDiscount());
		System.out.println("Discounted Price" + discounted);
		
		
		key.close();
		 

	}
	

}
