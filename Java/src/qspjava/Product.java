package qspjava;

public class Product {
	int price=250;
void productDetails() {
	System.out.println("product price="+this.price+" "+"RS");
}
public static void main(String[] args) {
	Product p =new Product();
	p.productDetails();
}
}
