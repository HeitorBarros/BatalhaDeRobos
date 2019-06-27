package br.ifb.tsi.poo.robo.modelo.habilidades;

public abstract class Habilidade {
		
	public String toString() {
		String teste = "";
		teste += this.getClass().getSimpleName();
		
		return teste;
	}
	
	public abstract int getCusto();
}
