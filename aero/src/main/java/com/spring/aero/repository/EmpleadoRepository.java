package com.spring.aero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.aero.model.Empleado;



public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {

	Object delete = null;
	

}
