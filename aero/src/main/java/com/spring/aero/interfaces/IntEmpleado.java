package com.spring.aero.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.spring.aero.model.Empleado;

public interface IntEmpleado extends CrudRepository <Empleado,Integer> {

}
