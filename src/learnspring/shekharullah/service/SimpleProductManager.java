/**
 * 
 */
package learnspring.shekharullah.service;

import java.util.List;

import learnspring.shekharullah.domain.Product;

/**
 * @author Shekhar Ullah
 * @Date 11th September,2016
 */
public class SimpleProductManager implements ProductManager {

	/*
	 * (non-Javadoc)
	 * 
	 * @see learninspring.shekharullah.service.ProductManager#increasePrice(int)
	 */
	@Override
	public void increasePrice(int percentage) {
		throw new UnsupportedOperationException();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see learninspring.shekharullah.service.ProductManager#getProducts()
	 */
	@Override
	public List<Product> getProducts() {
		throw new UnsupportedOperationException();
	}

	public void setProducts(List<Product> products) {
		throw new UnsupportedOperationException();
	}

}
