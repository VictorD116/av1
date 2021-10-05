package com.newton.av1.api;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import com.newton.av1.entity.Processo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProcessoDto {
	
	@Id
	private String id;
	
	private String descricao;
	
	private String autor;
	
	private String local;
	
	private LocalDate dataDePublicacao;
	
	private String status;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime modifiedAt;


	public ProcessoDto(Processo p) {
	
	this.setId(p.getId());
	this.setDescricao(p.getDescricao());
	this.setAutor(p.getLocal());
	this.setLocal(p.getDataDePublicacao());
	this.setStatus(p.getStatus());
	
	this.setCreatedAt(p.getCreatedAt());
	this.setModifiedAt(p.getModifiedAt());
	
	
	}

}