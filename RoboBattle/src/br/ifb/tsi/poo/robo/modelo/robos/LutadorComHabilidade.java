package br.ifb.tsi.poo.robo.modelo.robos;

import java.util.List;

import br.ifb.tsi.poo.robo.modelo.habilidades.Habilidade;

public interface LutadorComHabilidade extends Lutador{

	public List<Habilidade> getHabilidades();
	public void adicionaHabilidade(Habilidade h);
	public void aplicar(Habilidade h, Robo alvo);
	public void recuperarEnergia();
	
}
