package it.cagi.jasper_report;

import java.util.List;

public class OperatoreBeanReport {

	private String nome;
	
	private String cognome;
	
	private List<DisponibilitaBeanReport> listaDisponibilita;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public List<DisponibilitaBeanReport> getListaDisponibilita() {
		return listaDisponibilita;
	}

	public void setListaDisponibilita(
			List<DisponibilitaBeanReport> listaDisponibilita) {
		this.listaDisponibilita = listaDisponibilita;
	}
}
