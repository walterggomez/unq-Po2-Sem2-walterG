package ar.edu.unq.po2.Sem2.TDDTestUnidadPokerTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.Sem2.TDDTestUnidadPoker.PokerStatus;

class PokerStatusTest {
	
	PokerStatus pk;
	
	String asCorazon;
	String asPica;
	String asTrebol;
	String asDiamante;
	
	String dosCorazon;
	String dosPica;
	String dosTrebol;
	String dosDiamante;
	
	String jCorazon;
	String jPica;
	String jTrebol;
	String jDiamante;
	
	String kCorazon;
	String kPica;
	String kTrebol;
	String kDiamante;
	
	String onceCorazon;
	String oncePica;
	String onceTrebol;
	String onceDiamante;

	@BeforeEach
	void setUp() throws Exception {
		
		pk = new PokerStatus();
		
		asCorazon = "1C"; asPica="1P"; asTrebol = "1T";	asDiamante = "1D"; // Ases
		
		dosCorazon = "2C"; dosPica = "2P"; dosTrebol = "2T"; dosDiamante = "2D"; // Dos	
		
		jCorazon = "JC"; jPica = "JP"; jTrebol = "JT"; jDiamante = "JD"; // J
		
		kCorazon =  "KC"; kPica = "KP"; kTrebol = "KT"; kDiamante = "KD"; // K
		
		onceCorazon =  "11C"; oncePica = "11P"; onceTrebol = "11T"; onceDiamante = "11D"; // Once
			
	}
	
	// poker = cuatro cartas iguales en su valor
	@Test
	void hayPokerTest() {
		assertTrue(pk.verificar(asCorazon,asPica,asTrebol,asDiamante,jCorazon)); // poker de As
		assertTrue(pk.verificar(jPica,asPica,jTrebol,jDiamante,jCorazon));       // poker de J   
		assertTrue(pk.verificar(onceCorazon,oncePica,onceTrebol,onceDiamante,kDiamante)); // poker de 11
	}
	@Test
	void noHayPokerTest() {
		assertFalse(pk.verificar(onceCorazon,asPica,asTrebol,asDiamante,jCorazon));
		assertFalse(pk.verificar(onceCorazon,asPica,kTrebol,dosPica,jCorazon));
	}	

}
