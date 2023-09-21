package com.PaolaCristine.prjImgs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PaolaCristine.prjImgs.entities.Cliente;
import com.PaolaCristine.prjImgs.services.ClienteServices;

@RestController
@RequestMapping("/cliente")
public class ClientesController {
	
	private final ClienteServices clienteServices;

	@Autowired
	public ClientesController(ClienteServices clienteServices) {
		this.clienteServices = clienteServices;
	}

	@PostMapping
	public Cliente createProduct(@RequestBody Cliente cliente) {
		return clienteServices.saveCliente(cliente);
	}

	@GetMapping("/{id}")
	public Cliente getCliente(@PathVariable Long idcCliente) {
		return clienteServices.getClienteById(idcCliente);
	}

	@GetMapping
	public List<Cliente> getAllCliente() {
		return clienteServices.getAllCliente();
	}

	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Long idcCliente) {
		clienteServices.deleteCliente(idcCliente);
	}


}
