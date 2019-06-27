package br.ifb.tsi.poo.robo.modelo.robos;

import java.util.List;

import br.ifb.tsi.poo.robo.modelo.habilidades.Habilidade;

public interface LutadorComHabilidade extends Lutador{

	public List<Habilidade> getHabilidades();
	public void adicionaHabilidade(Habilidade h);
	public void aplicar(Habilidade h, Lutador alvo);
	
	public void reduzEnergia(int custo);
	public void recuperarEnergia();
	public void recuperarEnergia(int grauDeRecuperacao);
	public int getEnergia();
	
	public void habilitarModoDefesa();
	public void desabilitarModoDefesa();
	
}
