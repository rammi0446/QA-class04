import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartTest {

	//Test case 1: Creating new cart has 0 items
	@Test
	public void testCreateNewCart() {
		//. Create  a shopping cart
		ShoppingCart cart = new ShoppingCart();
		//2. check how many items are in it
		int numItems = cart.getItemCount();
		
		//3.compare your actual output with expected
		assertEquals(0,numItems);
	}
		//Test case 2: empty cart has 0 items
		@Test
		public void testEmptyCart() {
			//. You need a cart
			ShoppingCart cart = new ShoppingCart();
			//2. need to empty the cart
			cart.empty();
			
			//3.check how many items is in it
			int numItems = cart.getItemCount();
			
			//4. Compare expected to actual
			//5.if expected == actual ==>pass otherwise Fail
			assertEquals(0,numItems);
		
	}
		@Test
		public void testAddCart() {
			//. You need a cart
			ShoppingCart cart = new ShoppingCart();
			//2. need to empty the cart
			cart.empty();
			assertEquals(0,cart.getItemCount());
			//.Add new Item
			cart.addItem(new Product("samsungPhone", 1000));
			//4.check how many items
			int numItems = cart.getItemCount();
			//5. assert -->compare to actual 
			assertEquals(1, numItems);
		}
		

}
