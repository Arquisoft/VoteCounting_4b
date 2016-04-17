package es.uniovi.asw.DBManagement;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import es.uniovi.asw.DBManagement.domain.Vote;
import java.lang.Long;
import java.util.List;
import es.uniovi.asw.DBManagement.domain.PollingStation;

@Component("DBManagement")
public interface DBManagement extends CrudRepository<Vote, Long> {

	List<Vote> findByColegio(PollingStation colegio);

	List<Vote> findAll();
	
	

}
