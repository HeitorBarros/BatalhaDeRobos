package br.ifb.tsi.poo.robo.modelo.habilidades.impl;

import java.util.Random;

import br.ifb.tsi.poo.robo.modelo.habilidades.GeradorDeHabilidade;
import br.ifb.tsi.poo.robo.modelo.habilidades.Habilidade;

public class GeradorDeHabilidadeAleatória implements GeradorDeHabilidade{

	private Habilidade[] habilidades;
	private int qtde;
	
	public GeradorDeHabilidadeAleatória() {
		super();
		this.qtde = 1;
		this.habilidades = new Habilidade[qtde];
		this.habilidades[0] = new Tiro();
	}



	@Override
	public Habilidade gerarHabilidade() {
		
		return this.habilidades[new Random().nextInt(qtde)];
	}

}
