package org.shopping.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.shopping.abstracts.product.AbstractProduct;
import org.shopping.dao.IProductDao;
import org.shopping.dao.ProductDaoImpl;
import org.shopping.model.Product;

public class ProductDaoImplTest {
	IProductDao dao = new ProductDaoImpl();
	@Test
	public void getAllProductsTest() {
		List<Product> daoObject=dao.getAllProducts();
		assertTrue(daoObject!=null && daoObject.size()==2);
		
	}
	@Test
	public void getProductByNamesTest() {
		Product daoObject=dao.getProductByName("orange");
		assertTrue(daoObject!=null && daoObject.getName().equals("orange"));
		
		
	}
	
	@Test
	public void getProductByIdTest() {
		Product daoObject=dao.getProductByID(1);
		assertTrue(daoObject!=null && daoObject.getId()==1);
		
		
	}

	
}
