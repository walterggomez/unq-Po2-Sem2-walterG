package ar.edu.unq.po2.Sem2.TDDTestUnidadPoker;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PokerStatus {

	
	public boolean verificar(String primeraCarta, String segundaCarta, String terceraCarta, String cuartaCarta,
			String quintaCarta) {
		
		List<String> manoRecibida = Arrays.asList(primeraCarta,segundaCarta,terceraCarta,cuartaCarta,quintaCarta);
		List<String> valoresDeLaMano= this.numerosDeLasCartas(manoRecibida);
		
		boolean elPrimerValorSeRepite4 = Collections.frequency(valoresDeLaMano, valoresDeLaMano.get(0)) == 4 ;
		boolean elSegundoValorSeRepite4 = Collections.frequency(valoresDeLaMano, valoresDeLaMano.get(1)) == 4 ;
		
		return elPrimerValorSeRepite4 | elSegundoValorSeRepite4;
	}

	private List<String> numerosDeLasCartas(List<String> manoRecibida) {
		List<String> numeros= new ArrayList<String>();
		for (String num: manoRecibida) {
			numeros.add(num.substring(0,num.length()-1));
		}
		return numeros;
	}

}
