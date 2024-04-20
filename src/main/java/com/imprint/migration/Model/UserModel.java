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
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "userModel",fetch = FetchType.EAGER)
    private List<Store> store = new ArrayList<>();
    @OneToOne(fetch = FetchType.EAGER,mappedBy = "userModel")
    private ActiveStore activeStore;
}
