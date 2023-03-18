package com.example.alejito.controller;
import com.example.alejito.service.*;
import com.example.alejito.serviceIMPL.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.alejito.serviceIMPL.tsimpol;
@RestController
@RequestMapping("TareaRepo")
public class controlador {
	@Autowired
	private PSIMPL impl;
	@GetMapping(value = "ConsultarTareas", method = RequestMethod.GET)
	public ResponseEntity <?> ConsultarTareas(){
		List<Tarea> listaTarea=this.impl.consultarTarea();
		return ResponseEntity.ok(listatarea);
		
	}
	
	@PostMapping
	@RequestMapping
	(value = "CrearTareas", method = RequestMethod.POST)
	public ResponseEntity <?> CrearTareas(@RequestBody Tarea tarea ){
		Tarea tareaCreada=this.impl.CrearTarea(tarea);
		return ResponseEntity.status(HttpStatus.CREATED).body(TareaCreada)
		
	
}
	@PutMapping
	@RequestMapping
	(value = "ModificarTareas", method = RequestMethod.PUT)
	public ResponseEntity <?> ModificarTareas(@RequestBody Tarea tarea ){
		Tarea tareaModificada=this.impl.modificarTarea(tarea);
		return ResponseEntity.status(HttpStatus.CREATED).body(TareaModificada)
		
	
}

	
	@RequestMapping
	@GetMapping(value = "buscarTarea/{}", method = RequestMethod.GET)
	public ResponseEntity <?> BuscarTarea(@PathVariable int id ){
		Tarea buscada=this.impl.BuscarTarea(id);
		return ResponseEntity.ok(tarea);
}
	
	
	@DeleteMapping
	@RequestMapping
	(value = "EliminarTarea/{}", method = RequestMethod.@DELETE)
	public ResponseEntity <?> EliminarTarea(@PathVariable int id ){
		this.impl.EliminarTarea(id);
		return ResponseEntity.ok().build()
}