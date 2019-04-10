package br.ifb.tsi.poo.robo.modelo.habilidades.impl;

import br.ifb.tsi.poo.robo.modelo.habilidades.HabilidadeComAlvoSimples;
import br.ifb.tsi.poo.robo.modelo.robos.Robo;
import br.ifb.tsi.poo.robo.modelo.robos.RoboComHabilidade;

public class Tiro implements HabilidadeComAlvoSimples{

	@Override
	public void aplicar(RoboComHabilidade invocador, Robo alvo) {
		int custo = 30;
		invocador.reduzEnergia(custo);
		alvo.defender(10);
	}
	
	

}
