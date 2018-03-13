package org.shopping.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.shopping.abstracts.product.AbstractProduct;
import org.shopping.abstracts.product.Apples;
import org.shopping.abstracts.product.Oranges;
import org.shopping.model.Product;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DataSource {	
public static final String FILE_PATH = "products.xml";


	public List<Product> retrieveProduct(){
		List<Product> products = new ArrayList<>();
		try {
			
			
	        File inputFile = new File(FILE_PATH);
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	        
	         NodeList nList = doc.getElementsByTagName("product");
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               Product product = new Product();
	               product.setId(Integer.parseInt(eElement.getElementsByTagName("id").item(0).getTextContent()));
	               product.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
	               
	               product.setDescription(eElement.getElementsByTagName("description").item(0).getTextContent());
	               
	               products.add(product);
	            }
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		return products;
	}
	
	
}
