package Services;

import java.util.ArrayList;
import java.util.Optional;

import Models.ClienteModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repositories.IClienteRepository;

@Service
public class ClienteServices {

	@Autowired
	IClienteRepository clienteRepository;
	
	
	public ArrayList <ClienteModel> getCliente(){
		return (ArrayList<ClienteModel>) clienteRepository.findAll();
	}
	
	public ClienteModel saveCliente(ClienteModel cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Optional<ClienteModel>getById(Long id){
		return clienteRepository.findById(id);
	}
	
	public ClienteModel updateById (ClienteModel request, Long id ){
		
		ClienteModel cliente = clienteRepository.findById(id).get();
		
		cliente.setNombre(request.getNombre());
		cliente.setApellido(request.getApellido());
		cliente.setNumeroCliente(request.getNumeroCliente());
		cliente.setDireccion(request.getDireccion());
		cliente.setEmail(request.getEmail());
		
		
		return cliente;
		
	}
	
	public Boolean deleteCliente (Long id) {
		try {
			clienteRepository.deleteById(id);
			return true;
			
		}catch(Exception e){
			return false;
		}
	}
	
}
