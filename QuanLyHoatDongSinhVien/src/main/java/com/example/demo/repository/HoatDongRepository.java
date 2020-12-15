package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.HoatDong;

@Repository
public interface HoatDongRepository extends JpaRepository<HoatDong, Long> {

}
