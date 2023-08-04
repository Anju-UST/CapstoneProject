package com.example.product.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.Model.Product;
import com.example.product.Repository.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository productRepository;

	@Autowired
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Product getProductById(Long id) {
		return productRepository.findById(id)
				.orElseThrow();
	}

	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	public Product updateProduct(Long id, Product product) {
		Product existingProduct = getProductById(id);
		existingProduct.setName(product.getName());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setImage(product.getImage());
		return productRepository.save(existingProduct);
	}

	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}

	public List<Product> createMultipleProducts(List<Product> products) {
	    List<Product> createdProducts = productRepository.saveAll(products);
	    return createdProducts;
	}


}

