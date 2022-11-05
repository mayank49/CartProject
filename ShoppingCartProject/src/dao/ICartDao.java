package dao;

import models.Cart;

public interface ICartDao {
	
	boolean updateCart(Cart cart);
	
	Cart getCart(String cartId);

}
