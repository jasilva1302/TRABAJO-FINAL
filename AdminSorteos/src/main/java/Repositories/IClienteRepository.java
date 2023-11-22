package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Models.ClienteModel;
@Repository
public interface IClienteRepository extends JpaRepository<ClienteModel, Long>{
	
	

}
