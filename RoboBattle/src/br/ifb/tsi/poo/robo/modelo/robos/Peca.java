package br.ifb.tsi.poo.robo.modelo.robos;

public class Peca {

	private int ataque;
	private int defesa;
	private int velocidade;
	private int durabilidade;
	
	public Peca(int ataque, int defesa, int velocidade, int durabilidade) {
		super();
		this.ataque = ataque;
		this.defesa = defesa;
		this.velocidade = velocidade;
		this.durabilidade = durabilidade;
	}

	public int getAtaque() {
		if (this.funciona()) {
			return ataque;
		}
		return 0;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		if (this.funciona()) {
			return defesa;
		}
		return 0;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public int getVelocidade() {
		if (this.funciona()) {
			return velocidade;
		}
		return 0;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	
	public int getDurabilidade() {
		return durabilidade;
	}

	public void setDurabilidade(int durabilidade) {
		this.durabilidade = durabilidade;
	}

	@Override
	public String toString() {
		return "Peça [A=" + ataque + ", D=" + defesa + ", Dur="+ durabilidade +"]";
	}
	
	public boolean funciona() {
		return (durabilidade > 0);
	}
	
	public void reduzDurabilidade() {
		if(this.durabilidade>0) {
			this.durabilidade--;
		}
	}
	
}
