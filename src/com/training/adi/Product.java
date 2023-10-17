package com.training.adi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Product {
	private int prodId;
	private String prodName;
	private String prodCategory;
	private double price;
	Product(int prodId,String prodName,String prodCategory,double pice){
		this.prodId=prodId;
		this.prodName=prodName;
		this.prodCategory=prodCategory;
		this.price=price;
	}
	public int getProdId() {
		return prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public String getProdCategory() {
		return prodCategory;
	}
	public double getPrice() {
		return price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		List<Product> products=Arrays.asList(new Product(1,"Tshirt","Garments",2000.0),
				new Product(2,"Jeans","Clothes",1500),
				new Product(3,"Sports-Shoes","Shoes",2500),
				new Product(4,"Belt","Accessory",500)
				);
		List<Product> l1=products.stream().filter(product->product.getPrice()>500).collect(Collectors.toList());
		
		l1.stream().distinct().forEach(t->System.out.println(t.getProdId()+"-"+t.getProdName()+"-"+t.getProdCategory()+"-"+t.getPrice()));
		
	}

}
