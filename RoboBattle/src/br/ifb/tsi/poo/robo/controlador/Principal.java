package br.ifb.tsi.poo.robo.controlador;

import br.ifb.tsi.poo.robo.modelo.batalhas.BatalhaComHabilidades;
import br.ifb.tsi.poo.robo.modelo.batalhas.BatalhaEmTurnos;
import br.ifb.tsi.poo.robo.modelo.construtores.ConstrutorDeBatalha;
import br.ifb.tsi.poo.robo.modelo.construtores.ConstrutorDeRoboAleatorio;
import br.ifb.tsi.poo.robo.modelo.construtores.ConstrutorDeRoboInterativo;
import br.ifb.tsi.poo.robo.modelo.construtores.ConstrutorDeLutadorInterativoComHabilidade;

public class Principal {
	public static void main(String[] args) {
		ConstrutorDeBatalha cb = new ConstrutorDeBatalha(new ConstrutorDeLutadorInterativoComHabilidade(), new BatalhaComHabilidades());
		cb.construirBatalha();
	}
}
