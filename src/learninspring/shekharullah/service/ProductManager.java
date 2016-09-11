/**
 * 
 */
package learninspring.shekharullah.service;

import java.io.Serializable;
import java.util.List;

import learnspring.shekharullah.domain.Product;

/**
 * @author Shekhar Ullah
 * @Date 11th September,2016
 */
public interface ProductManager extends Serializable {
	public void increasePrice(int percentage);

	public List<Product> getProducts();
}
