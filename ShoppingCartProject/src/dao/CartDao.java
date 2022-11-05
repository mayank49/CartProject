package dao;

import db.InMemoryDB;
import models.Cart;
import models.Item;
import models.User;

public class CartDao implements ICartDao {
	
	private final InMemoryDB db;
	
	public CartDao(InMemoryDB db) {
		this.db = db;
	}

	@Override
	public boolean updateCart(Cart cart) {
		return db.applyCart(cart.getId(), cart);
	}

	@Override
	public Cart getCart(String cartId) {
		return db.getCart(cartId);
	}
}
