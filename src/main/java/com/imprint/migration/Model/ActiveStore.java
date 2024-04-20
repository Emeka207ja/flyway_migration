package com.imprint.migration.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ActiveStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long activeStore_id;
    private Long storeId;
    private  String name;
    @OneToOne
    @JoinColumn(name = "user_id")
    private  UserModel userModel;
}
