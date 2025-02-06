package com.example.java.lombok;

import lombok.Value;
import lombok.With;

@Value // membuat value di dalamnya menjadi bentuk final
// (variable sudah tidak dapat dirubah setelah di set) mirip seperti @Data
@With
public class Register {

    String username;

    String password;

}
