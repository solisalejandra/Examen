package com.spring.aero.service;

import java.util.List;

import com.spring.aero.model.Empleado;

public interface IEmpleadoService {

	Empleado createEmpleado(Empleado empleado);
	Empleado updateEmpleado(Empleado empleado);
	List <Empleado> getAllEmpleado ();
	Empleado getEmpleadoById(Integer EmpleadoId);
	void deleteEmpleado(Integer id);
	
	
	
	

}
