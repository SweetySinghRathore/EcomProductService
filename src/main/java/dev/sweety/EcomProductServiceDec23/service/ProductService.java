package dev.sweety.EcomProductServiceDec23.service;

import dev.sweety.EcomProductServiceDec23.dto.CreateProductRequestDTO;
import dev.sweety.EcomProductServiceDec23.dto.ProductResponseDTO;
import dev.sweety.EcomProductServiceDec23.entity.Product;
import dev.sweety.EcomProductServiceDec23.exception.ProductNotFoundException;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    List<ProductResponseDTO> getAllProducts();
    ProductResponseDTO getProduct(UUID productId) throws ProductNotFoundException;
    ProductResponseDTO createProduct(CreateProductRequestDTO product);
    ProductResponseDTO updateProduct(CreateProductRequestDTO updatedProduct, UUID productId);
    boolean deleteProduct(UUID productId);
    ProductResponseDTO getProduct(String productName);
    List<Product> getProducts(double minPrice, double maxPrice);
}
