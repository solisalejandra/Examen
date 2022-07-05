package com.spring.aero.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.aero.interfaceService.InterfaceEmpleadoService;
import com.spring.aero.interfaces.IntEmpleado;
import com.spring.aero.model.Empleado;
import com.spring.aero.repository.EmpleadoRepository;

@Service
@Transactional
public class EmpleadoService implements InterfaceEmpleadoService{

	private static Integer getId;

	@Autowired
	private IntEmpleado data;
	
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Override
	public Empleado createEmpleado(Empleado empleado) {
		return empleadoRepository.save(empleado);
	}

	@Override
	public Optional<Empleado> listarId(int id) {
		Optional<Empleado> empleadodb = this.empleadoRepository.findById(EmpleadoService.getId);
		return empleadoRepository.findById(getId);
	}

	@Override
	public Empleado updateEmpleado(Empleado empleado) throws Exception {
		Optional<Empleado> empleadoDb = this.empleadoRepository.findById(empleado.getId());

		if (empleadoDb.isPresent()) {
			Empleado empleadoUpdate = empleadoDb.get();
			empleadoUpdate.setId(empleado.getId());
			empleadoRepository.save(empleadoUpdate);
			return empleadoUpdate;
		} else {
			throw new Exception("Registro no encontrado con id : " + empleado.getId());
		}
	}
	@Override
	public int save(Empleado e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) throws Exception  {
		
		Optional<Empleado> empleadoDb = this.empleadoRepository.findById(id);
		if (empleadoDb.isPresent()) {
			this.empleadoRepository.delete(empleadoDb.get());
		} else {
			throw new Exception("Registro no encontrado con id : " + id);
		}

	}
		


	public Object getProductById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleado> listar() {
		return this.empleadoRepository.findAll();
	}

}
