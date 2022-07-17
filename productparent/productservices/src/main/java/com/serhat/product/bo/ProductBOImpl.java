package com.serhat.product.bo;

import com.serhat.product.dao.ProductDAO;
import com.serhat.product.dao.ProductDAOImpl;
import com.serhat.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
