package com.PaolaCristine.prjImgs.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.PaolaCristine.prjImgs.repositories.ClienteRepositories;
import com.PaolaCristine.prjImgs.entities.Cliente;


@Service
public class ClienteServices {
	
	private  final ClienteRepositories clienteRepositories;
	
	@Autowired
	public ClienteServices (ClienteRepositories clienteRepositories) {
		this.clienteRepositories = clienteRepositories;
	}
	
	public Cliente saveCliente (Cliente cliente) {
		return clienteRepositories.save(cliente);
	}
	
	public List<Cliente> getAllCliente(){
		return clienteRepositories.findAll();
	}
	
	public Cliente getClienteById (Long idcCliente) {
		return clienteRepositories.findById(idcCliente).orElse(null);
	}
	
	public void deleteCliente(Long idcCliente) {
		clienteRepositories.deleteById(idcCliente);
	}
}


