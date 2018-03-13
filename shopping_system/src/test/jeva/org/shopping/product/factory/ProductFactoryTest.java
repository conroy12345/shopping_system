package org.shopping.product.factory;

import static org.junit.Assert.*;

import org.junit.Test;
import org.shopping.abstracts.exception.NotFoundException;
import org.shopping.abstracts.product.AbstractProduct;
import org.shopping.abstracts.product.Apples;
import org.shopping.abstracts.product.Oranges;
import org.shopping.factory.ProductFactory;

public class ProductFactoryTest {
	ProductFactory  factury = new ProductFactory ();
	@Test
	public void vegetableProductTest() throws NotFoundException {
		
		AbstractProduct product=factury.manufactureProduct("apples");
		assertTrue(product instanceof Apples);
		assertEquals("apple",product.getName());
	}
	
	@Test
	public void metProductTest() throws NotFoundException{
		AbstractProduct product=factury.manufactureProduct("oranges");
		assertTrue(product instanceof Oranges);
		assertEquals("orange",product.getName());
	}

}
