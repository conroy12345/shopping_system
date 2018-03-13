package org.shopping.abstracts.product;

public abstract class AbstractProduct {
protected int id;
protected double price;
protected int quantity;
protected String name;
protected String description;
/**
 * @return the price
 */
public double getPrice() {
	return price;
}

/**
 * @param price the price to set
 */
public void setPrice(double price) {
	this.price = price;
}

/**
 * @return the quantity
 */
public int getQuantity() {
	return quantity;
}

/**
 * @param quantity the quantity to set
 */
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the description
 */
public String getDescription() {
	return description;
}

/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}


/**
 * @return the id
 */
public int getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}

public abstract String retrieveProductResult();
public abstract double getUnitPrice();
}
