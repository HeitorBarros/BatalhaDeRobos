package br.ifb.tsi.poo.robo.modelo.robos;

import br.ifb.tsi.poo.robo.modelo.habilidades.Habilidade;

public class PecaComHabilidade extends Peca {

	private Habilidade habilidade;
	
	public PecaComHabilidade(int ataque, int defesa, int velocidade, int durabilidade) {
		super(ataque, defesa, velocidade, durabilidade);	
	}

	public PecaComHabilidade(Peca peca) {
		super(peca.getAtaque(), peca.getDefesa(), peca.getVelocidade(), peca.getDurabilidade());

	}

	public Habilidade getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(Habilidade habilidade) {
		this.habilidade = habilidade;
	}

	@Override
	public String toString() {
		String msg = super.toString();
		msg +=" "+ (this.getHabilidade()!=null?this.getHabilidade():"");
		return msg;
	}
	

}
