package com.example.sp25sd19303.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SinhVien {

    private String fullName;

    private String address;

    private Integer age;
}
