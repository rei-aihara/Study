package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AnimeEntity;

/**
 * アニメ情報 Repository
 */
@Repository
public interface AnimeRepository extends JpaRepository<AnimeEntity, Integer> {
}