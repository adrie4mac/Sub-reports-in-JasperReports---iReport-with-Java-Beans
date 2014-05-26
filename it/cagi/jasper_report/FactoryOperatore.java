package it.cagi.jasper_report;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FactoryOperatore {

	public static Collection getCollectionOperatore() {
		
		OperatoreBeanReport operatore = new OperatoreBeanReport();
		operatore.setNome("nome test");
		operatore.setCognome("cognome test");
		
		
		List<DisponibilitaBeanReport> listaDisponibilita = new ArrayList<DisponibilitaBeanReport>();
		
		
		DisponibilitaBeanReport disponibilita = new DisponibilitaBeanReport();
		disponibilita.setDay("test day");
		disponibilita.setEvening("test evening");
		
		listaDisponibilita.add(disponibilita);
		
		operatore.setListaDisponibilita(listaDisponibilita);
		
		return Arrays.asList(operatore);
	}
}
