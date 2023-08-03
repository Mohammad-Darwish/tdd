package com.amigoscode.testing.basket.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    private Long id;
    private String name;
    private String description;
    private String category;  // should be enum
    private BigDecimal price;
    private Integer quantity;

}
