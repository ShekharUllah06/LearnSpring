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
	 private List<Product> products;
	/*
	 * (non-Javadoc)
	 * 
	 * @see learninspring.shekharullah.service.ProductManager#increasePrice(int)
	 */
	@Override
	public void increasePrice(int percentage) {
		if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() * 
                                    (100 + percentage)/100;
                product.setPrice(newPrice);
            }
        }

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see learninspring.shekharullah.service.ProductManager#getProducts()
	 */
	@Override
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
