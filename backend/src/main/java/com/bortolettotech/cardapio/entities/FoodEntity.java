package com.bortolettotech.cardapio.entities;

import com.bortolettotech.cardapio.dtos.FoodRequestDTO;
import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Table(name = "foods")
@Entity(name = "foods")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode(of = "id")
public class FoodEntity {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotNull
    private String title;
    @NotNull
    private String image;
    @NotNull
    private Double price;

    public FoodEntity(FoodRequestDTO data) {
        this.title = data.title();
        this.image = data.image();
        this.price = data.price();
    }
}
