package models;

import java.util.List;

public class Cart {
	
	private final String id;
	private final String userId;
	private final List<Item> itemList;
	
	public Cart(String id, String userId, List<Item> itemList) {
		super();
		this.id = id;
		this.userId = userId;
		this.itemList = itemList;
	}

	public String getId() {
		return id;
	}

	public String getUserId() {
		return userId;
	}

	public List<Item> getItemList() {
		return itemList;
	}
}
