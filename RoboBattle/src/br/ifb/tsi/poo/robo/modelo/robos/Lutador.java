package br.ifb.tsi.poo.robo.modelo.robos;

public interface Lutador {
	public void atacar(Lutador lutador);
	public void defender(int dano);
	public boolean estaVivo();
	public String getNome();

}
