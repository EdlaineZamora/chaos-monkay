package com.architecture.chaosmonkey;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
public class ProductResource {

    @GetMapping(value = "/products")
    public List<String> retrieveProductNames() {
        return asList("Product 1", "Product 2", "Product 3");
    }

}
