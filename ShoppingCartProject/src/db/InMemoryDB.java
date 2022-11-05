package db;

import java.util.HashMap;
import java.util.Map;

import models.Cart;
import models.Item;
import models.User;

public class InMemoryDB {
	
	public Map<String, User> userMemoryMap = new HashMap<>();

	public Map<String, Cart> cartMemoryMap = new HashMap<>();
	
	public Map<String, Item> itemMemoryMap = new HashMap<>();
	
	private static InMemoryDB instance;
	
	private InMemoryDB() {
		
	}
	
	public static InMemoryDB getInstance() {
		if(instance == null) {
			instance = new InMemoryDB();
		}
		return instance;
	}
	
	public boolean applyUser(String userId, User user) {
		userMemoryMap.put(userId, user);
		return true;
	}
	
	public boolean applyCart(String cartId, Cart cart) {
		cartMemoryMap.put(cartId, cart);
		return true;
	}
	
	public boolean applyItem(String itemId, Item item) {
		itemMemoryMap.put(itemId, item);
		return true;
	}
	
	public User getUser(String userId) {
		return userMemoryMap.get(userId);
	}
	
	public Cart getCart(String cartId) {
		return cartMemoryMap.get(cartId);
	}
	
	public Item getItem(String itemId) {
		return itemMemoryMap.get(itemId);
	}
}
