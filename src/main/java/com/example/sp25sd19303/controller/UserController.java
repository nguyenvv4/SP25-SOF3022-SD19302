package com.example.sp25sd19303.controller;

import com.example.sp25sd19303.model.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/user/hien-thi")
    // khi mo form tao 1 model attribute co ten la user => rang buoc voi th:object ben html
    // cac thuoc tinh cua user: id, name, age... tuong duong voi th:field trong html
    public String hienThi(@ModelAttribute("user") User user) {
        return "/user.html";
    }

    @PostMapping("/user/save")
    // de nhan duoc attribute user thi phai dung model attribute
    public String save(@Valid @ModelAttribute("user") User user, Errors errors) {
        System.out.println(user.toString());
        return "/user.html";
    }
}
