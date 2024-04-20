package com.imprint.migration.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String name;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "product_category",
            joinColumns = @JoinColumn(name="product_id",referencedColumnName = "productId"),
            inverseJoinColumns = @JoinColumn(name = "category_id",referencedColumnName = "categoryId")
    )
    private List<Category> category = new ArrayList<>();
}
