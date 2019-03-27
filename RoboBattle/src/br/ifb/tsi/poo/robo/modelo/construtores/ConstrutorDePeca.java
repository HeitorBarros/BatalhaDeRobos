package br.ifb.tsi.poo.robo.modelo.construtores;

import java.util.Random;

import br.ifb.tsi.poo.robo.modelo.robos.Peca;

public class ConstrutorDePeca {
	
	//Constroi uma peça com 12 pontos distribuídos nos
	//Atributos
	public static Peca construirPeca() {
		Random rand = new Random();
		int ataque = 0, defesa = 0, velocidade = 0, durabilidade = 0, durabilidadeBase = 1, n = 10;
		for (int i = 0; i < n; i++) {
			switch(rand.nextInt(4)) {
			case 0:		ataque++;		break;
			case 1:		defesa++;		break;
			case 2:		velocidade++;	break;
			case 3:		durabilidade++;	break;
			}
		}
		
		Peca p = new Peca(ataque, defesa, velocidade, durabilidadeBase + durabilidade);
		return p;
	}
	
}
