package com.hugovitoroliveira.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugovitoroliveira.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
