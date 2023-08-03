package com.amigoscode.testing.basket;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/basket")
public class BasketController {

    @PostMapping
    public ResponseEntity<UUID> createBasket() {
        UUID uuid = UUID.randomUUID();
        return new ResponseEntity<>(uuid, HttpStatus.CREATED);
    }

    @GetMapping("{uuid}")
    public ResponseEntity<UUID> createBasket(@PathVariable String uuid) {
        new UUID(uuid);
        return new ResponseEntity<>(uuid, HttpStatus.CREATED);
    }
}
