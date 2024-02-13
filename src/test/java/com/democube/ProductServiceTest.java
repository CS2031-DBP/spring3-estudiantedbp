package com.democube;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @InjectMocks
    private ProductService productService;
    @Mock
    private ProductRepository productRepository;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this); // Inicializa los mocks y las inyecciones
    }

    @Test
    public void testCreateNewProduct() {
        Product product = productService.newProduct("Queso", 17.5);
        assertEquals("Queso", product.getName());
        assertEquals(17.5, product.getPrice());
    }

    @Test
    public void hello(){
        System.out.println(productService.hello());
    }

}