package com.hiennt.pizzabackend.repository;

import com.hiennt.pizzabackend.entity.Protype;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProtypeRepository extends JpaRepository<Protype, Integer> {
}
