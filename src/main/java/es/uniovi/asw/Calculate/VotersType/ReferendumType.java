package es.uniovi.asw.Calculate.VotersType;

import java.util.List;
import java.util.Map;

public class ReferendumType implements VotersType{
	
	private Referendum tipo;

	
	public  ReferendumType(List<Map<String,String>> votes, String Yes, String No, String White) {
		tipo = new Referendum(votes, Yes, No, White);
	}
	
	@Override
	public Map<String, Integer> getResult() {
		return tipo.result();
	}

	@Override
	public void actualize() {
		// TODO Auto-generated method stub
		
	}

}
