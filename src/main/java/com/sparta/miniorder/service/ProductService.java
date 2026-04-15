package com.sparta.miniorder.service;

import com.sparta.miniorder.dto.product.ProductRequest;
import com.sparta.miniorder.dto.product.ProductResponse;
import com.sparta.miniorder.entity.Product;
import com.sparta.miniorder.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ProductService {

    private final ProductRepository productRepository;

    @Transactional
    public ProductResponse createProduct(ProductRequest request) {
        Product product = Product.createProduct(request.getName(),request.getPrice());
        productRepository.save(product);
        return ProductResponse.from(product);
    }

    public ProductResponse getProduct(Long id) {
        Product product = findProductById(id);
        return ProductResponse.from(product);
    }

    public List<ProductResponse> getProducts() {
        return productRepository.findAll().stream()
                .map(ProductResponse::from)
                .toList();
    }

    @Transactional
    public ProductResponse updateProduct(Long id, ProductRequest request) {
        Product product = findProductById(id);
        product.update(request.getName(), request.getPrice());
        return ProductResponse.from(product);
    }

    @Transactional
    public void deleteProduct(Long id) {
        Product product = findProductById(id);
        productRepository.delete(product);
    }


    //** private methods **//
    private Product findProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("상품이 존재하지 않습니다. id: " + id));
    }
}
