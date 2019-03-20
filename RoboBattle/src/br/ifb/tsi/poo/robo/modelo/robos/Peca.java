package br.ifb.tsi.poo.robo.modelo.robos;

public class Peca {

	private int ataque;
	private int defesa;
	private int velocidade;
	
	public Peca(int ataque, int defesa, int velocidade) {
		super();
		this.ataque = ataque;
		this.defesa = defesa;
		this.velocidade = velocidade;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
}
