package br.ifb.tsi.poo.robo.modelo.batalhas;

import br.ifb.tsi.poo.robo.modelo.robos.Robo;

public abstract class Batalha {
	
	protected Robo r1;
	protected Robo r2;
	
	public Batalha() {
		super();
		this.r1 = new Robo();
		this.r2 = new Robo();
	}

	public Batalha(Robo r1, Robo r2) {
		super();
		this.r1 = r1;
		this.r2 = r2;
	}
	
	public abstract void iniciar();

	public void setR1(Robo r1) {
		this.r1 = r1;
	}

	public void setR2(Robo r2) {
		this.r2 = r2;
	}
	
	
	
}
