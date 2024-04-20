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
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeId;
    private String name;
    private String location;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel userModel;
    @OneToMany(mappedBy = "store",fetch = FetchType.EAGER)
    private List<Product> products = new ArrayList<>();
}
