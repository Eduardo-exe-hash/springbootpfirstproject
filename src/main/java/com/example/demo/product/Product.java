package com.example.demo.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name;

    @Column(nullable = false)
    private float price;

    @Column(nullable = false)
    private int stock;

    public Product(){
    }
    public Product( String name, float price){
        this.name = name;
        this.price = price;
    }
    public void atualizarEstoque(int stock){
        this.stock += stock;
    }

    public void exibirDetalhes(){
        System.out.println("Produto:" + name+ "ID:" + id+ "Estoque:" + stock);
    }
}

