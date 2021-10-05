package com.newton.av1.processo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.newton.av1.api.ProcessoDto;
import com.newton.av1.entity.Processo;
import com.newton.av1.service.ProcessoService;

public class ProcessoController {
	private final ProcessoService processoService;
	
	@GetMapping("/processo/{id}")
	public ProcessoDto getbyId(@PathVariable String id) {
		var processo = processoService.get(id);
		
		return new ProcessoDto(processo);
	}
	
	@GetMapping("/processos")
	public List<ProcessoDto> getAll(){
		var processos = processoService.getAll();
		
		var processoDtos = new ArrayList<ProcessoDto>();
		
		for(var processo: processos) {
			processoDtos.add(new ProcessoDto(processo));
			
		}
		return processoDtos;
		
	}
	//create
	@PostMapping("/processo1")
	public ProcessoDto create(@RequestBody ProcessoDto processoDto) {
		var processo = new Processo(processoDto);
		
		processo = processoService.create(processo);
		
		return new ProcessoDto(processo);
		
	}
	
	//update
	@PutMapping("/processos{id}")
	public ProcessoDto create(@PathVariable String id,@RequestBody ProcessoDto processoDto) {
		var processo = new Processo(processoDto);
		
		processo = processoService.update(id, processo);
		return new ProcessoDto(processo);
	}
	
	//delete
	@DeleteMapping("/processos/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id){
		processoService.delete(id);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		
	}
	

}


