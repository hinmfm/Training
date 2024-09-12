package lab04;

public class EntryProduct {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product pr1 = p1.nhapThongTin("Chó", 200, 0.1);
		p1.xuatThongTin(pr1);
		System.out.println("Tax = " + p1.getTaxPrice(pr1.getPrice(), pr1.getTax()));
	}
}
