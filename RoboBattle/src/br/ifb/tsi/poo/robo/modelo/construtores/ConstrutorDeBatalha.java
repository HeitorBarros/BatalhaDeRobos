package br.ifb.tsi.poo.robo.modelo.construtores;

import br.ifb.tsi.poo.robo.modelo.batalhas.Batalha;
import br.ifb.tsi.poo.robo.modelo.batalhas.BatalhaEmTurnos;
import br.ifb.tsi.poo.robo.modelo.robos.Robo;

public class ConstrutorDeBatalha {
	private ConstrutorDeRobo construtorDeRobo;
	private Batalha batalha;

	public ConstrutorDeBatalha(ConstrutorDeRobo construtorDeRobo, Batalha batalha) {
		super();
		this.construtorDeRobo = construtorDeRobo;
		this.batalha = batalha;
	}

	public void construirBatalha() {
		
		Robo r1 = construtorDeRobo.construirRobo();
		Robo r2 = construtorDeRobo.construirRobo();
		
		this.batalha.setR1(r1);
		this.batalha.setR2(r2);
		batalha.iniciar();
	}
}
