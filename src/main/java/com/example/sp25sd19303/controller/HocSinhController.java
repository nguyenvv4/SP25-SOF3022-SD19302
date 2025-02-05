package com.example.sp25sd19303.controller;

import com.example.sp25sd19303.model.HocSinh;
import com.example.sp25sd19303.repository.HocSinhRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class HocSinhController {
    // thong thuong Repo repo= new Repo();
    // interface
    @Autowired
    HocSinhRepo hocSinhRepo;

    @GetMapping("/hoc-sinh/hien-thi")
    public String home(Model model) {
        List<HocSinh> list = hocSinhRepo.findAll();
        model.addAttribute("list", list);
        return "/hoc-sinh/hoc-sinh.html";
    }

    @PostMapping("/hoc-sinh/add")
    public String add(HocSinh hocSinh) {
        System.out.println(hocSinh.toString());
        hocSinhRepo.save(hocSinh);
        return "redirect:/hoc-sinh/hien-thi";
    }

    @GetMapping("/hoc-sinh/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        hocSinhRepo.deleteById(id);
        return "redirect:/hoc-sinh/hien-thi";
    }

    @GetMapping("/hoc-sinh/detail/{id}")
    public String deteail(@PathVariable("id") Integer id, Model model) {
        HocSinh hocSinh = hocSinhRepo.findById(id).get();
        System.out.println(hocSinh.toString());
        model.addAttribute("hocSinh", hocSinh);
        return "/hoc-sinh/detail.html";
    }

    @PostMapping("/hoc-sinh/update/{id}")
    public String update(HocSinh hocSinh) {
        System.out.println("id can update la :" + hocSinh.getId());
        System.out.println(hocSinh.toString());
        hocSinhRepo.save(hocSinh);
        return "redirect:/hoc-sinh/hien-thi";
    }
}
