package br.ifb.tsi.poo.robo.modelo.construtores;

import br.ifb.tsi.poo.robo.modelo.robos.Robo;

public abstract class ConstrutorDeRobo {
	
	public Robo construirRobo() {
		return new Robo();
	}
}
