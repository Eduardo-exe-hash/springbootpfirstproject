package com.example.demo.services;
import java.util.List;
import java.util.Optional;
import com.example.demo.product.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.repository.ProductRepository;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepository productRepository;

    public List<Product> listarTodos(){
        return productRepository.findAll();

    }
    public Optional <Product> buscarPorId(Long id){
        return productRepository.findById(id);

    }
    public List<Product> criarProduto(Product product){
        productRepository.save(product);

        return listarTodos();
    }
    public boolean deletarProduto(Long id){

        if ((productRepository.existsById(id))) {

            productRepository.deleteById(id);

            return true;
        }
        return false;
    }
}
