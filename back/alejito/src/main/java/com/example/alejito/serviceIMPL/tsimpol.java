package com.example.alejito.serviceIMPL;
import com.example.alejito.entity.tarea;
import com.example.alejito.service.TareaService;

import java.util.List;

@Service
public class tsimpol implements {

	private TareaRepo repo;
	@Autowired
	@override
	public List<Tarea> CosultarTarea(){
		return (List<Tarea>)this.repo.findAll();
	}
	
	@Override
	public Tarea CrearTarea(Tarea tarea) {
		tarea.setEmail(tarea.getEmail());
		return this.repo.save(tarea);
	}
	
	@Override
	public Tarea ModificarTarea(Tarea tarea) {
		return this.repo.save(tarea);
	}
	
	@Override
	public void EliminarTarea(int id)
	{
		this.repo.deleteById(id);
	}
	
	@Override 
	public Tarea BuscarTarea(int id) {
		return this.repo.findById(id).get();
		
	}
	}
	
	
}
