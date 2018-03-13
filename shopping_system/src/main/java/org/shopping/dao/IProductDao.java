package org.shopping.dao;

import java.util.List;

import org.shopping.model.Product;

public interface IProductDao {
public List <Product>getAllProducts();
public Product getProductByID(int id);
public Product getProductByName(String name);
}
