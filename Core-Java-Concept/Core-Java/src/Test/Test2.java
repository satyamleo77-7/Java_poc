package Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Test2 {


	
	public static void main(String[] args) {
	
		List<Product>list=new ArrayList<Product>();
	list.add(new Product(1,"Soap", 10))	;
	list.add(new Product(2,"Bottle", 12));
	list.add(new Product(3,"Candle",7));
	list.add(new Product(4,"Vosco",14));
	//Collections.sort(list,Comparator.comparing(Product::getPrice));
	
	list.stream().filter(p->p.getPrice()>10).sorted(Comparator.comparing(Product::getPrice)).forEach(System.out::println);
	
	list.stream().sorted((p1,p2)->p1.getPrice().compareTo(p2.getPrice())).forEach(System.out::println);
	
	}


}
class Product{
	int id;
	String name;
	Integer price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Product(int id, String name, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}

