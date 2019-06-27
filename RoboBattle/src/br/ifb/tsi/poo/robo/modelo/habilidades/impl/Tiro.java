package br.ifb.tsi.poo.robo.modelo.habilidades.impl;

import br.ifb.tsi.poo.robo.modelo.habilidades.HabilidadeComAlvoSimples;
import br.ifb.tsi.poo.robo.modelo.robos.Lutador;
import br.ifb.tsi.poo.robo.modelo.robos.LutadorComHabilidade;
import br.ifb.tsi.poo.robo.modelo.robos.Robo;
import br.ifb.tsi.poo.robo.modelo.robos.RoboComHabilidade;

public class Tiro extends HabilidadeComAlvoSimples{

	private final int CUSTO = 30;
	
	

	@Override
	public void aplicar(LutadorComHabilidade invocador, Lutador alvo) {
		
		
		if(invocador.getEnergia() >= CUSTO) {
			System.out.println("Aplicando a Habilidade Tiro!");
			invocador.reduzEnergia(CUSTO);
			alvo.defender(30);
		}else {
			System.out.println("Energia insuficiente!");
		}
	}
	
	@Override
	public String toString() {
		return "Tiro (30 de dano) E=-30";
	}

	@Override
	public int getCusto() {
		return CUSTO;
	}

}
