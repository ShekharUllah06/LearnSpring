/**
 * 
 */
package learnspring.shekharullah.domain;

import junit.framework.TestCase;
import learnspring.shekharullah.domain.Product;

/**
 * @author Shekhar Ullah
 * @Date 11th September,2016
 */
public class ProductTests extends TestCase {
	private Product product;

	protected void setUp() throws Exception {
		product = new Product();
	}

	public void testSetAndGetDescription() {
		String testDescription = "aDescription";
		assertNull(product.getDescription());
		product.setDescription(testDescription);
		assertEquals(testDescription, product.getDescription());
	}

	public void testSetAndGetPrice() {
		double testPrice = 100.00;
		assertEquals(0, 0, 0);
		product.setPrice(testPrice);
		assertEquals(testPrice, product.getPrice(), 0);
	}
}
