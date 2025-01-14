package com.example.sp25sd19303.controller;

import com.example.sp25sd19303.model.SinhVien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;

@Controller
public class HomeController {

    // dinh nghia duong dan /home voi phuong thuc GET
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("hoTen", "Nguyen Van A");
        System.out.println("da chay vao get");
        return "/home.html";
    }

    @PostMapping("/login")
    public void login() {
        System.out.println("Da chay vao post");
    }

    @GetMapping("/click")
    public String click(Model model) {
        model.addAttribute("message", "forward");
        return "forward:/forward";
    }

    @GetMapping("/forward")
    public String forward() {
        return "/forward.html";

    }

    @GetMapping("/click/redirect")
    public String clickRedirect(RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute("message", "redirect");
        return "redirect:/redirect";
    }

    @GetMapping("/redirect")
    public String redirect(Model model,
                           @RequestParam("message") String message) {
        model.addAttribute("message", message);
        return "/redirect.html";
    }

    @GetMapping("/sinh-vien")
    public String sinhVien(Model model) {
        SinhVien sinhVien = SinhVien.builder()
                .fullName("Nguyen Van A")
                .address("Ha Noi")
                .age(16).build();

        model.addAttribute("sinhVien", sinhVien);

        // 1 danh sach sinh vien
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        listSinhVien.add(new SinhVien("Nguyen Van B", "Hai Phong", 15));
        listSinhVien.add(new SinhVien("Nguyen Van C", "Hai Phong", 15));
        listSinhVien.add(new SinhVien("Nguyen Van D", "Hai Phong", 15));
        listSinhVien.add(new SinhVien("Nguyen Van E", "Hai Phong", 15));
        model.addAttribute("list", listSinhVien);
        return "/sinh-vien.html";

    }

}
