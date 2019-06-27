package br.ifb.tsi.poo.robo.modelo.construtores;

import br.ifb.tsi.poo.robo.modelo.robos.Lutador;
import br.ifb.tsi.poo.robo.modelo.robos.Robo;

public abstract class ConstrutorDeLutador {
	
	public Lutador construirLutador() {
		return new Robo();
	}
}
