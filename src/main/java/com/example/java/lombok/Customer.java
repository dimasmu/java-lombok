package com.example.java.lombok;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor // membuat constructor tanpa parameter
@AllArgsConstructor // membuat constructer dengan semua parameter
@EqualsAndHashCode(exclude = {
        "name"
})
public class Customer {

    private String id;

    private String name;

}
