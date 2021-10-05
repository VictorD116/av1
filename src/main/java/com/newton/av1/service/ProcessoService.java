package com.newton.av1.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.newton.av1.entity.Processo;
import com.newton.av1.repository.ProcessoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProcessoService {
	private final ProcessoRepository processoRepository;
	
	public Processo create(Processo p) {
		var now = LocalDateTime.now();
		p.setCreatedAt(now);
		p.setModifiedAt(now);
		
		processoRepository.save(p);
		
		return p;
	}
	
	public Processo update(String id, Processo p) {
		var existing = get(id);
		
		existing.setDescricao(p.getDescricao());
		existing.setAutor(p.getAutor());
		existing.setLocal(p.getLocal());
		existing.setDataDePublicacao(p.DataDePublicacao());
		existing.setStatus(p.Status());
		
		existing.setModifiedAt(LocalDateTime.now());
		processoRepository.save(existing);
		
		return existing;
		
	}
	
	public Processo get(string id) {
		var processo = processoRepository.findById(id);
		
		if(processo.isEmpty()) {
			throw new com.newton.av1.exception.NotFoundException("Employee with ID" + id + "not found");
		}
		return processo.get();
	}
	public List<Processo> getAll(){
		return processoRepository.findAll();
	}

}
