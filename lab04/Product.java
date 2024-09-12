package lab04;

class Product {
	private String name;
	private double price;
	private double tax;

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public Product() {

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return this.tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTaxPrice(double price, double tax) {
		return price * tax;
	}

	public Product nhapThongTin(String name, double price, double tax) {
		Product pr = new Product(name, price, tax);
		return pr;
	}

	public void xuatThongTin(Product p1) {
		System.out.println("Tên sản phẩm: " + p1.getName());
		System.out.println("Giá sản phẩm: " + p1.getPrice());
		System.out.println("Thuế: " + p1.getTax());
	}
}
