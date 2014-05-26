package it.cagi.jasper_report;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FactoryDisponibilita {

	public static Collection getCollectionDisponibilita() {
		
		List<DisponibilitaBeanReport> listaDisponibilita = new ArrayList<DisponibilitaBeanReport>();
		
		
		DisponibilitaBeanReport disponibilita = new DisponibilitaBeanReport();
		disponibilita.setDay("test day");
		disponibilita.setEvening("test evening");
		
		listaDisponibilita.add(disponibilita);
		
		
		return listaDisponibilita;
	}
}
