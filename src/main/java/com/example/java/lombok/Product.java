package com.example.java.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data // langsung ada @setter, @getter, @ToString, @hasCodeEqual
@AllArgsConstructor
@ToString(exclude = {
        "price"
}) // masih bisa melakukan override meskipun sudah deklarasi @Data
public class Product {

    private final String id;

    private String name;

    private Long price;

}
