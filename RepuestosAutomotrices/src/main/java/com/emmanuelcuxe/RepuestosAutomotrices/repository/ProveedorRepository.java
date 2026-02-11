package com.emmanuelcuxe.RepuestosAutomotrices.repository;

import com.emmanuelcuxe.RepuestosAutomotrices.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Empleado,Integer> {

}
