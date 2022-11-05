import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import dao.CartDao;
import models.Cart;
import service.CartService;

public class CartServiceTest {

	CartService cartService;
	
	CartDao cartDao;
	
	@Before
	public void setup() {
		cartDao = Mockito.mock(CartDao.class);
		cartService = new CartService(cartDao);
	}
	
	@Test
	public void addItemToCart_Test() {
		String cartId = "cartId";
		String itemId = "itemId";
		
		Cart mockCart = Mockito.mock(Cart.class);
		Mockito.when(mockCart.getId()).thenReturn(cartId);
		
		Mockito.when(cartDao.getCart(Mockito.eq(cartId))).thenReturn(mockCart);
		
		Mockito.when(cartDao.updateCart(Mockito.eq(mockCart))).thenReturn(true);
		
		boolean check = cartService.addItemToCart(cartId, itemId);
		
		assertEquals(true, check);
	}
}
