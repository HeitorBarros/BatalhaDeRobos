package br.ifb.tsi.poo.robo.modelo.robos;

import br.ifb.tsi.poo.robo.modelo.habilidades.Habilidade;

public class PecaComHabilidade extends Peca {

	private Habilidade habilidade;
	
	public PecaComHabilidade(int ataque, int defesa, int velocidade, int durabilidade) {
		super(ataque, defesa, velocidade, durabilidade);	
	}

	public Habilidade getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(Habilidade habilidade) {
		this.habilidade = habilidade;
	}
	
	

}
