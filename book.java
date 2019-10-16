/**
 * 
 */

/**
 * @author user
 *
 */
public class book {
	/*atttributes*/
	private String isbn;
	private String title;
	private int noPages;
	private boolean isElectronic;
	private double price;
	private double discount;
	
	
	public book() {
		this.isbn = "";
		this.title = "";
		this.noPages =0;
		this.isElectronic=false;
		this.price = 0.0;
		this.discount = 0;
		
	}
	
	public book(String isbn, String title, int noPages, boolean isELectronic, double price) {
		this.isbn = isbn;
		this.title = title;
		this.noPages = noPages;
		this.isElectronic = isElectronic;
		this.price = price;
		this.discount = discount;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the noPages
	 */
	public int getNoPages() {
		return noPages;
	}

	/**
	 * @param noPages the noPages to set
	 */
	public void setNoPages(int noPages) {
		this.noPages = noPages;
	}

	/**
	 * @return the isElectronic
	 */
	public boolean isElectronic() {
		return isElectronic;
	}

	/**
	 * @param isElectronic the isElectronic to set
	 */
	public void setElectronic(boolean isElectronic) {
		this.isElectronic = isElectronic;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the discount
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public double calculateDiscount(double price, double discount) {
		return(price-((price * discount)/100));
	}

	@Override
	public String toString() {
		return "book [isbn=" + isbn + ", title=" + title + ", noPages=" + noPages + ", isElectronic=" + isElectronic
				+ ", price=" + price + ", discount=" + discount + "]";
	}
		
		
		
		
		
		
	
}

