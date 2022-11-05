package service;

import dao.ICartDao;
import models.Cart;
import models.Item;

public class CartService implements ICartService {

	private final ICartDao cartDao;
	
	public CartService(ICartDao cartDao) {
		this.cartDao = cartDao;
	}
	
	@Override
	public boolean addItemToCart(String cartId, String itemId) {
		boolean itemAddedSuccessfully = false;
		
		Cart cart = cartDao.getCart(cartId);
		Item item = new Item(cartId, itemId, 0);
		
		cart.getItemList().add(item);
		
		itemAddedSuccessfully = cartDao.updateCart(cart);
		
		return itemAddedSuccessfully;
	}

	@Override
	public boolean removeItemFromCart(String cartId, String itemId) {
		// TODO Auto-generated method stub
		return false;
	}

}
