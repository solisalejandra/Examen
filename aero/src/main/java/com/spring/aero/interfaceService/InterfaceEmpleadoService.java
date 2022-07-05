package com.spring.aero.interfaceService;

import java.util.List;
import java.util.Optional;

import com.spring.aero.model.Empleado;

public interface InterfaceEmpleadoService {
	
	public List <Empleado>listar();
	public Optional <Empleado>listarId(int id);
	public int save (Empleado e);
	public void delete(int id) throws Exception;
	public Empleado createEmpleado(Empleado empleado);
	public String updateEmpleado(Empleado empleado);
	

}
