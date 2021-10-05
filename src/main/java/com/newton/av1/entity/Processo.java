package com.newton.av1.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import com.newton.av1.api.ProcessoDto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.With;

@With
@AllArgsConstructor
@NoArgsConstructor

public class Processo {
	
	@Id
	
	private String id;
	
	private String descricao;
	
	private String autor;
	
	private String local;
	
	private LocalDate dataDePublicacao;
	
	private String status;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime modifiedAt;
	
	public Processo(ProcessoDto p) {
		
		this.setDescricao(p.getDescricao());
		this.setAutor(p.getAutor());
		this.setLocal(p.getLocal());
		this.setDataDePublicacao(p.getDataDePublicacao());
		this.setStatus(p.getStatus());
		
		this.setCreatedAt(p.getCreatedAt());
		this.setModifiedAt(LocalDateTime.now());
	}

}
