package org.shopping.factory;

import org.shopping.abstracts.exception.NotFoundException;
import org.shopping.abstracts.product.AbstractProduct;
import org.shopping.abstracts.product.Apples;
import org.shopping.abstracts.product.Oranges;
import org.shopping.dao.IProductDao;
import org.shopping.dao.ProductDaoImpl;
import org.shopping.model.Product;

public class ProductFactory {
	
	IProductDao dao = new ProductDaoImpl();
	
	public AbstractProduct manufactureProduct(String productName) throws NotFoundException{
		if("apples".equalsIgnoreCase(productName)){
			AbstractProduct product = new Apples();
			processProduct(product,"apple");
			return product;
		}else if(productName.equalsIgnoreCase("oranges")){
			AbstractProduct product = new Oranges();
			processProduct(product,"orange");
			return product;
		}else{
			throw new NotFoundException("404", "cannot find that product ");
		}
		
	}

	/**
	 * 
	 * @param product
	 * @param name
	 */
	private void processProduct(AbstractProduct product, String name) {
		Product prd = dao.getProductByName(name);
		product.setId(prd.getId());
		product.setName(prd.getName());
		product.setDescription(prd.getDescription());
		product.setPrice(prd.getPrice());
		
		if(name.equalsIgnoreCase("apples")) {
			
		}
	}
}
