package com.serhat.product.bo;

import com.serhat.product.dto.Product;

public interface ProductBO {

	void create(Product product);
	
	Product findProduct(int id);
}
