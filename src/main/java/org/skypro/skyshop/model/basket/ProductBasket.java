package org.skypro.skyshop.model.basket;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class ProductBasket {
    private final Map<UUID, Integer> basket = new HashMap();

    public ProductBasket() {
    }

    public void addProduct(UUID id) {
        this.basket.put(id, (Integer)this.basket.getOrDefault(id, 0) + 1);
    }

    public Map<UUID, Integer> getBasket() {
        return Collections.unmodifiableMap(this.basket);
    }
}
