package br.ifb.tsi.poo.robo.modelo.habilidades;

import br.ifb.tsi.poo.robo.modelo.robos.Lutador;
import br.ifb.tsi.poo.robo.modelo.robos.LutadorComHabilidade;

public abstract class HabilidadeComAlvoSimples extends Habilidade {

	public abstract void aplicar(LutadorComHabilidade invocador, Lutador alvo);
	
}
