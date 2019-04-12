package br.ifb.tsi.poo.robo.modelo.construtores;

import java.util.Random;

import br.ifb.tsi.poo.robo.modelo.robos.Lutador;
import br.ifb.tsi.poo.robo.modelo.robos.Peca;
import br.ifb.tsi.poo.robo.modelo.robos.Robo;

public class ConstrutorDeRoboAleatorio extends ConstrutorDeLutador{

	public Lutador construirLutador() {
		Random rand = new Random();
		String nome = "Robo"+rand.nextInt(rand.nextInt(5)+1);
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		
		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	
}
