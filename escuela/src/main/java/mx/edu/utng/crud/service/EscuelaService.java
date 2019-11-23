package mx.edu.utng.crud.service;

/**
 *@author Jaqueline López Morales
 * 22 de noviembre de 2019
 * email: JaquiMorales2020@gmail.com
 */


import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import mx.edu.utng.crud.entity.*;
import mx.edu.utng.crud.repository.IEscuelaRepository;

@Service
public class EscuelaService {
	
	//Objeto que hace conexión con MySQL
	private IEscuelaRepository repository;
	
	//Constructor que inyecta objeto al Spring
	public EscuelaService(IEscuelaRepository escuela) {
		this.repository = escuela;
	}

	/**
	 * Método para guardar una escuela
	 * @param e Objeto escuela
	 * @return La escuela guardada
	 */
	public Escuela save(Escuela e) {
		return repository.save(e);
	}
	
	/**
	 * Método que lista las escuelas
	 * @return Lista de escuelas
	 */
	public List<Escuela> list(){
		//Irá y regresará de la BD
		return repository.findAll();
		
	}
	
	/**
	 * Método para eliminar una escuela
	 * @param id identificador de la escuela
	 */
	public void eliminar(Long id) {
		repository.deleteById(id);
	}
	
	
	/**
	 * Método que encuentra una escuela
	 * @param id identificador de la escuela
	 * @return Escuela
	 */
	public Optional<Escuela> encontrarId(Long id){
		return repository.findById(id);
		
	}
}
