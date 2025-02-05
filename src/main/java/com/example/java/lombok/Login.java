package com.example.java.lombok;

import lombok.*;

// Lombok memakai static method

@Getter
@AllArgsConstructor(access = AccessLevel.PACKAGE, staticName = "create")
@NoArgsConstructor(access = AccessLevel.PACKAGE, staticName = "createEmpty")
@ToString(exclude = {
        "password"
}) // untuk mengexclude variable biasanya untuk data sensitif
public class Login {

    @Setter(value = AccessLevel.PROTECTED)
    private String username;

    @Setter(value = AccessLevel.PROTECTED)
    private String password;


}
