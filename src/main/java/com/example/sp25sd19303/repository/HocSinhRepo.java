package com.example.sp25sd19303.repository;

import com.example.sp25sd19303.model.HocSinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HocSinhRepo extends JpaRepository<HocSinh, Integer> {
}
