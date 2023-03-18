package com.example.alejito.service;

public interface TareaService {

	public List<Tarea> ConsultarTarea();
	
	public Tarea CrearTarea(Tarea tarea);
	public Tarea modificarTarea(Tarea tarea);
	public Tarea buscarTarea(int id);
	public void eliminarTarea(int id );
	
}
