package com.PaolaCristine.prjImgs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PaolaCristine.prjImgs.entities.Cliente;

public interface ClienteRepositories extends JpaRepository<Cliente,Long> {

	
}
