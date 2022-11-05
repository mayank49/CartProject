package service;

public interface ICartService {

	boolean addItemToCart(String cartId, String itemId);
	
	boolean removeItemFromCart(String cartId, String itemId);
}
