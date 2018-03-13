package org.shopping.abstracts.product;

public class Oranges extends AbstractProduct {

	@Override
	public String retrieveProductResult() {
		
		return price+quantity+name+description;
	}

	@Override
	public double getUnitPrice() {
		
		return .25;
	}

}
