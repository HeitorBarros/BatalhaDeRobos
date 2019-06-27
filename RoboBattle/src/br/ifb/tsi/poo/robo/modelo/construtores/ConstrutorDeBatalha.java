package br.ifb.tsi.poo.robo.modelo.construtores;

import br.ifb.tsi.poo.robo.modelo.batalhas.Batalha;
import br.ifb.tsi.poo.robo.modelo.batalhas.BatalhaEmTurnos;
import br.ifb.tsi.poo.robo.modelo.robos.Lutador;
import br.ifb.tsi.poo.robo.modelo.robos.Robo;

public class ConstrutorDeBatalha {
	private ConstrutorDeLutador construtorDeLutador;
	private Batalha batalha;

	public ConstrutorDeBatalha(ConstrutorDeLutador construtorDeRobo, Batalha batalha) {
		super();
		this.construtorDeLutador = construtorDeRobo;
		this.batalha = batalha;
	}

	public void construirBatalha() {
		
		Lutador r1 = construtorDeLutador.construirLutador();
		Lutador r2 = construtorDeLutador.construirLutador();
		
		this.batalha.setR1(r1);
		this.batalha.setR2(r2);
		batalha.iniciar();
	}
}
