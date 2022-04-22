package com.service;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import com.bean.Product;

public class ProductService {

	List<Product> listOfProduct;
	
	public ProductService() {
		listOfProduct= Arrays.asList(new Product(1,"Tv",12000),new Product(2,"COmputer",14000),new Product(3,"Laptop",16000));
	}
	public String storeProduct(Product pp) {
		int flag = 0;
		ListIterator<Product> li = listOfProduct.listIterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid()==pp.getPid()) {
				flag=1;
				break;
	
			}
		}
		if(flag==0) {
			storeProduct(pp);
			return "Record stored successfully";
			
		}else {
			return "Record id must be unique";
		}
		boolean bb = listOfProduct.stream().filter(p->p.getid()==pp.getPid())findAny().isPresent();
		if(bb) {
			re
		}
	}
}
