/**
 * 
 */
package learninspring.shekharullah.service;

import junit.framework.TestCase;

/**
 * @author Shekhar Ullah
 * @Date 11th September,2016
 */
public class SimpleProductManagerTests extends TestCase {
	private SimpleProductManager productManager;

	protected void setUp() throws Exception {
		productManager = new SimpleProductManager();
	}

	public void testGetProductsWithNoProducts() {
		productManager = new SimpleProductManager();
		assertNull(productManager.getProducts());
	}
}
