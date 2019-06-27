package br.ifb.tsi.poo.robo.modelo.construtores;

import java.util.Random;

import br.ifb.tsi.poo.robo.modelo.habilidades.GeradorDeHabilidade;
import br.ifb.tsi.poo.robo.modelo.habilidades.impl.GeradorDeHabilidadeAleatória;
import br.ifb.tsi.poo.robo.modelo.robos.Peca;
import br.ifb.tsi.poo.robo.modelo.robos.PecaComHabilidade;

public class ConstrutorDePecaComHabilidade extends ConstrutorDePeca {

	public Peca construirPeca() {
		GeradorDeHabilidade gerador = new GeradorDeHabilidadeAleatória();
		PecaComHabilidade peca = new PecaComHabilidade(super.construirPeca());
		if(new Random().nextInt(100)<20) {
			peca.setHabilidade(gerador.gerarHabilidade());
		}
		return peca;
		
	}
	
}
