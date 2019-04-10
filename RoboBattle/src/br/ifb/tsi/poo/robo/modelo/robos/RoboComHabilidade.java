package br.ifb.tsi.poo.robo.modelo.robos;


import java.util.ArrayList;
import java.util.List;

import br.ifb.tsi.poo.robo.modelo.habilidades.Habilidade;
import br.ifb.tsi.poo.robo.modelo.habilidades.HabilidadeComAlvoInvocador;
import br.ifb.tsi.poo.robo.modelo.habilidades.HabilidadeComAlvoSimples;

public class RoboComHabilidade extends Robo implements LutadorComHabilidade{
	private int energia;
	private List<Habilidade> habilidades;
	
	
	
	public RoboComHabilidade(String nome, Peca cabeca, Peca tronco, Peca bracoEsquerdo, Peca bracoDireito,
			Peca pernas) {
		super(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
		this.setEnergia(100);
		this.habilidades = new ArrayList<>();
		
		if(cabeca instanceof PecaComHabilidade) {
			this.adicionaHabilidade(((PecaComHabilidade) cabeca).getHabilidade());
		}
		if(tronco instanceof PecaComHabilidade) {
			this.adicionaHabilidade(((PecaComHabilidade) tronco).getHabilidade());
		}
		if(pernas instanceof PecaComHabilidade) {
			this.adicionaHabilidade(((PecaComHabilidade) pernas).getHabilidade());
		}
		if(bracoDireito instanceof PecaComHabilidade) {
			this.adicionaHabilidade(((PecaComHabilidade) bracoDireito).getHabilidade());
		}
		if(bracoEsquerdo instanceof PecaComHabilidade) {
			this.adicionaHabilidade(((PecaComHabilidade) bracoEsquerdo).getHabilidade());
		}
		
		
	}

	@Override
	public List<Habilidade> getHabilidades() {
		return this.habilidades;
	}

	@Override
	public void aplicar(Habilidade h, Robo alvo) {
		if(h instanceof HabilidadeComAlvoSimples) {
			((HabilidadeComAlvoSimples) h).aplicar(this, alvo);
		}else if (h instanceof HabilidadeComAlvoInvocador) {
			((HabilidadeComAlvoInvocador) h).aplicar(this);
		}
	}

	@Override
	public void recuperarEnergia() {
		int grauDeRecuperacao = 20;
		this.setEnergia(this.getEnergia() + grauDeRecuperacao);
	}

	@Override
	public void adicionaHabilidade(Habilidade h) {
		this.habilidades.add(h);
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	public void reduzEnergia(int energia) {
		this.energia -= energia;
	}

}
