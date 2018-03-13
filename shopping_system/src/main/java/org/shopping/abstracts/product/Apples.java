package org.shopping.abstracts.product;

public class Apples extends AbstractProduct {

	@Override
	public String retrieveProductResult() {
		
		return price+quantity+name+description;
	}

	@Override
	public double getUnitPrice() {
		
		return 0.60;
	}

}
