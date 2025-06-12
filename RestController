package com.example.foodapi;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;
import java.util.*;

@RestController
@RequestMapping("/items")
public class ItemController {

  private final AtomicLong counter = new AtomicLong();
  private final Map<Long, Item> items = new ConcurrentHashMap<>();

  @GetMapping
  public Collection<Item> all() {
    return items.values();
  }

  @GetMapping("/{id}")
  public Item one(@PathVariable Long id) {
    return items.get(id);
  }

  @PostMapping
  public Item create(@RequestBody Item item) {
    long id = counter.incrementAndGet();
    Item newItem = new Item(id, item.name());
    items.put(id, newItem);
    return newItem;
  }
}
