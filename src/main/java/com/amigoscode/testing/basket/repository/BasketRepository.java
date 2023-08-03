package com.amigoscode.testing.basket.repository;

import com.amigoscode.testing.basket.model.Basket;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class BasketRepository {
    private final Map<UUID, Basket> basketMap = new HashMap<>();

    public Basket findByUUID(UUID uuid){
        Basket basket = basketMap.get(uuid); // add try catch
        return basket;
    }
}
