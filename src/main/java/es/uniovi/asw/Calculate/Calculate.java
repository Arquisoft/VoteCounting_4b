package es.uniovi.asw.Calculate;

import es.uniovi.asw.Calculate.VotersType.VotersType;
import es.uniovi.asw.Calculate.info.ObjectInfo;
import es.uniovi.asw.DBManagement.GetVotes;

public class Calculate {

	private VotersType type;
	private GetVotes votes;
	private ObjectInfo info;
	
	public Calculate(VotersType type, GetVotes votes, ObjectInfo info){
		this.type=type;
		this.votes=votes;
		this.info=info;
		
		getVs();
	}
	
	private void getVs(){
		//Aqui pido los nuevos votos a procesar y llamo los mmetodos encargados de procesarlos
	}
	
	private void sendInfo(){
		info.actualiza(type.getResult());
		//pasar info como param. a la web
	}
	
	public void actualiceC(){
		getVs();
		info.actualiza(type.getResult());
	}
}
