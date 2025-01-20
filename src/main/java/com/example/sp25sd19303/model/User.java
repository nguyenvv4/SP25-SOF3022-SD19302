package com.example.sp25sd19303.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class User {

    @NotNull(message = "khong duoc de trong id")
    private Integer id;

    @NotBlank(message = "khong duoc de trong name")
    private String name;

    @NotNull(message = "khong duoc de trong age")
    private Integer age;

    private String address;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
