package com.example.sp25sd19303.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Table(name = "hoc_sinh")
@Entity
@Data
public class HocSinh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotBlank(message = "Ten khong duoc de trong")
    @Column(name = "name")
    private String name;

    @NotNull(message = "Tuoi khong duoc de trong")
    @Column(name = "age")
    private Integer age;

    @Column(name = "status")
    private String status;

    @Override
    public String toString() {
        return "HocSinh{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", status='" + status + '\'' +
                '}';
    }
}
