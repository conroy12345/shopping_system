package org.shopping.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.shopping.abstracts.product.AbstractProduct;
import org.shopping.factory.ProductFactory;
import org.shopping.model.Product;

public class CustomerService {
	static ProductFactory factory = new ProductFactory();
	
	static void checkout() {
		Product product = new Product();
		product.setName(JOptionPane.showInputDialog("enter product name"));		
		product.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("enter product quantity")));
			
		try{
		AbstractProduct abstractproduct = factory.manufactureProduct(product.getName());	
		
		double price = abstractproduct.getUnitPrice()*product.getQuantity();
		JOptionPane.showMessageDialog(null, "product purcsase: "+ product.getName()+"\n"+
		"quantity: "+product.getQuantity()+"\n"+
		"price per unit: £"+abstractproduct.getUnitPrice()+"\n"+
		"price: £"+price);
		//String productName=product.getName();
		List<String>itemList=new ArrayList<>();
		itemList.add(product.getName());
		
		 for(String name: itemList){
			 int quantity=product.getQuantity();
	            if (name.equals("apples")){	          
	            	product.setQuantity(quantity +quantity);
	            	JOptionPane.showMessageDialog(null, "a special offer of buy one get one free are available for \n"
	            	+product.getName()+" you have purchase  "+quantity+" and recieved "+product.getQuantity());
	            }else if (name.equals("oranges")){
	            	product.setQuantity((quantity/2)+quantity);
	            	JOptionPane.showMessageDialog(null, "a special offer of 3 for the price of 2 are available for \n"
	    	            	+product.getName()+" you have purchase  "+quantity+" and recieved "+product.getQuantity());
	            }
	        }
		 JOptionPane.showMessageDialog(null, "thank you for shapping please come again soon");	
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
}
