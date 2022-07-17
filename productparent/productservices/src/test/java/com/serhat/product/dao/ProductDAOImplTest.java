package com.serhat.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.serhat.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {
		
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		
		product.setId(1);
		product.setName("iPhone 1");
		product.setDescription("It is expensive but good!");
		product.setPrice(900);
		
		dao.create(product);
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("iPhone 1", result.getName());
	}

}
