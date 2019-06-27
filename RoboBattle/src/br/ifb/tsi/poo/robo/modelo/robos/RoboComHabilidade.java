package br.ifb.tsi.poo.robo.modelo.robos;


import java.util.ArrayList;
import java.util.List;

import br.ifb.tsi.poo.robo.modelo.habilidades.Habilidade;
import br.ifb.tsi.poo.robo.modelo.habilidades.HabilidadeComAlvoInvocador;
import br.ifb.tsi.poo.robo.modelo.habilidades.HabilidadeComAlvoSimples;

public class RoboComHabilidade extends Robo implements LutadorComHabilidade{
	private int energia;
	private List<Habilidade> habilidades;
	private boolean modoDefesa;
	
	
	
	public RoboComHabilidade(String nome, Peca cabeca, Peca tronco, Peca bracoEsquerdo, Peca bracoDireito,
			Peca pernas) {
		super(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
		this.setEnergia(100);
		modoDefesa = false;
		this.habilidades = new ArrayList<>();
		PecaComHabilidade ph;
		if(cabeca instanceof PecaComHabilidade) {
			ph = ((PecaComHabilidade) cabeca);
			if(ph.getHabilidade() != null) {
				this.adicionaHabilidade(ph.getHabilidade());
			}
		}
		if(tronco instanceof PecaComHabilidade) {
			ph = ((PecaComHabilidade) tronco);
			if(ph.getHabilidade() != null) {
				this.adicionaHabilidade(ph.getHabilidade());
			}
		}
		if(pernas instanceof PecaComHabilidade) {
			ph = ((PecaComHabilidade) pernas);
			if(ph.getHabilidade() != null) {
				this.adicionaHabilidade(ph.getHabilidade());
			}
		}
		if(bracoDireito instanceof PecaComHabilidade) {
			ph = ((PecaComHabilidade) bracoDireito);
			if(ph.getHabilidade() != null) {
				this.adicionaHabilidade(ph.getHabilidade());
			}
		}
		if(bracoEsquerdo instanceof PecaComHabilidade) {
			ph = ((PecaComHabilidade) bracoEsquerdo);
			if(ph.getHabilidade() != null) {
				this.adicionaHabilidade(ph.getHabilidade());
			}
		}
		
		
	}
	
	@Override
	public void defender(int dano) {
		if(modoDefesa) {
			dano = (dano * 80) / 100;
			super.defender(dano);
			this.recuperarEnergia(10);
		}else {
			super.defender(dano);
		}
	}

	@Override
	public List<Habilidade> getHabilidades() {
		return this.habilidades;
	}

	@Override
	public void aplicar(Habilidade h, Lutador alvo) {
		if(h instanceof HabilidadeComAlvoSimples) {
			((HabilidadeComAlvoSimples) h).aplicar(this, alvo);
		}else if (h instanceof HabilidadeComAlvoInvocador) {
			((HabilidadeComAlvoInvocador) h).aplicar(this);
		}
	}

	@Override
	public void recuperarEnergia() {
		int grauDeRecuperacao = 10;
		this.setEnergia(this.getEnergia() + grauDeRecuperacao);
	}
	
	@Override
	public void recuperarEnergia(int grauDeRecuperacao) {
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
	
	public void habilitarModoDefesa() {
		this.modoDefesa = true;
	}
	
	public void desabilitarModoDefesa() {
		this.modoDefesa = false;
	}

	@Override
	public String toString() {
		String msg = super.toString();
		msg += " E="+this.getEnergia()+" - "+ this.getHabilidades();
		return msg;
	}
	
	

}
