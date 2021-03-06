package org.shopping.abstracts.product;

import static org.junit.Assert.*;

import org.junit.Test;
import org.shopping.abstracts.exception.NotFoundException;
import org.shopping.abstracts.product.AbstractProduct;
import org.shopping.factory.ProductFactory;

public class AbstractProductTest {
	ProductFactory factory = new ProductFactory();
	@Test
	public void vegetableProductTest() throws NotFoundException {
		String productName=1.0+2.0+"orange"+"Ripe Oranges";
		AbstractProduct abstractProduct=factory.manufactureProduct("oranges");
		abstractProduct.setPrice(1);
		abstractProduct.setQuantity(2);
		abstractProduct.setName("orange");
		abstractProduct.setDescription("Ripe Oranges");
		assertEquals(productName,abstractProduct.retrieveProductResult());
	}

	@Test
	public void meatProductTest() throws NotFoundException{
		String productName=60.0+2.0+"apple"+"Golden Apples";
		AbstractProduct product = factory.manufactureProduct("apples");
		product.setPrice(60);
		product.setQuantity(2);
		product.setName("apple");
		product.setDescription("Golden Apples");
		assertEquals(productName,product.retrieveProductResult());
	}
}
