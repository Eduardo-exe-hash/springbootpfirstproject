package com.example.demo.controller;
import java.util.List;

import java.util.Optional;
import com.example.demo.product.Product;
import com.example.demo.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/produtos")
@AllArgsConstructor
public class Controller {


    private ProductService productService;

    @GetMapping
    public List<Product> listarTodos(){
        return productService.listarTodos();
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> buscarPorId(@PathVariable Long id) {

        Optional <Product> produto = productService.buscarPorId(id);

        return produto.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

    }

    @PostMapping()
    public ResponseEntity<List<Product>> criarProduto(@RequestBody Product product){

        return ResponseEntity.ok(productService.criarProduto(product));

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Long id){

        return productService.deletarProduto(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();

    }

}

