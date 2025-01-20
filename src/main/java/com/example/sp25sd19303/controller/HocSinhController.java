package com.example.sp25sd19303.controller;

import com.example.sp25sd19303.model.HocSinh;
import com.example.sp25sd19303.repository.HocSinhRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HocSinhController {
    // thong thuong Repo repo= new Repo();
    // interface
    @Autowired
    HocSinhRepo hocSinhRepo;
    @GetMapping("/hoc-sinh/hien-thi")
    public String home() {
        List<HocSinh> list = hocSinhRepo.findAll();
        for (HocSinh hs : list) {
            System.out.println(hs.toString());
        }
        return "/home.html";
    }
}
