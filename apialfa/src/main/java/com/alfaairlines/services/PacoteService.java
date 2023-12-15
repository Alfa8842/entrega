package com.alfaairlines.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alfaairlines.models.PacoteModel;
import com.alfaairlines.repositories.IPacoteRepository;

@Service 
public class PacoteService {
	private final IPacoteRepository pacoteRepositories;
	
	public PacoteService (IPacoteRepository pacoteRepositories) {
		this.pacoteRepositories = pacoteRepositories;
	}
	public PacoteModel createPacote(PacoteModel pacote) {
		if (pacote ==null) {
			throw new IllegalArgumentException("Pacote não existente");
		
		}
		return pacoteRepositories.save(pacote);
	}
	public List<PacoteModel> listPacote(){
		return pacoteRepositories.findAll();
	}
	public PacoteModel updatePacote (PacoteModel pacoteUpdated) {
		if (pacoteUpdated == null || pacoteUpdated.getId() == null) {
			throw new IllegalArgumentException("Pacote não encontrado");
			
		}
		return pacoteRepositories.save(pacoteUpdated);
	}
	public void delete (String id) {
		if (id == null) {
			throw new IllegalArgumentException("Id não encontrado");
		}
		pacoteRepositories.deleteById(id);
	}
}
