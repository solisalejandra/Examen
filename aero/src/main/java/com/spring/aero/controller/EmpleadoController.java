package com.spring.aero.controller;

import java.util.List;

import org.hibernate.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.app.model.Product;
import com.spring.aero.model.Empleado;
import com.spring.aero.service.EmpleadoService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
	
	private static final String EmpleadoService = null;
	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping("/listar")
	public ResponseEntity listar(Model model) {
		List<Empleado> empleados = empleadoService.listar();
		model.addAttribute("empleados", empleados);
		return ResponseEntity.ok().body(empleadoService.listar());
	}
	
	@GetMapping("/detalleempleado/{id}")
	public Object getProductById(@PathVariable Integer id) {
		return ResponseEntity.ok().body(empleadoService.getProductById(id));
	}
	
	@PostMapping("/creaempleado")
	public ResponseEntity<Empleado> createProduct(@RequestBody Empleado empleado) {
		return ResponseEntity.ok().body(this.EmpleadoService.createEmpleado(empleado));
	}
	
	@PutMapping("/actualizaempleado/{id}")
	public ResponseEntity<Empleado> updateProduct(@PathVariable Integer id, @RequestBody Empleado empleado) {
		empleado.setId(id);
		return ResponseEntity.ok().body(this.EmpleadoService.updateEmpleado(empleado));
	}
	
	@DeleteMapping("/eliminaempleado/{id}")
	public HttpStatus deleteProduct(@PathVariable Integer id) {
		this.EmpleadoService.delete(id);
		return HttpStatus.OK;
	}
}
