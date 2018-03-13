package org.shopping.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.shopping.abstracts.product.AbstractProduct;
import org.shopping.model.Product;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ProductDaoImpl implements IProductDao {
	private DataSource dataSource = new DataSource();
	
	@Override
	public List<Product> getAllProducts() {
		return dataSource.retrieveProduct();
	}

	@Override
	public Product getProductByID(int id) {
		List<Product>products=dataSource.retrieveProduct();
		for(Product prod:products){
			if(prod.getId()==id){
				return prod;
			}
			
		}
		return null;
	}

	@Override
	public Product getProductByName(String name) {
	
	List<Product>products=dataSource.retrieveProduct();
	for(Product prod : products){
		if(name.equals(prod.getName())){
			return prod;
		}
	  }
		return null;
	}

	
	
}
