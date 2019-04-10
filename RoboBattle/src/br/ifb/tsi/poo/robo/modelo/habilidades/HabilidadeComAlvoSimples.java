package br.ifb.tsi.poo.robo.modelo.habilidades;

import br.ifb.tsi.poo.robo.modelo.robos.Robo;
import br.ifb.tsi.poo.robo.modelo.robos.RoboComHabilidade;

public interface HabilidadeComAlvoSimples extends Habilidade {

	public void aplicar(RoboComHabilidade invocador, Robo alvo);
	
}
