package br.ifb.tsi.poo.robo.controlador;

import br.ifb.tsi.poo.robo.modelo.batalhas.BatalhaEmTurnos;
import br.ifb.tsi.poo.robo.modelo.construtores.ConstrutorDeBatalha;
import br.ifb.tsi.poo.robo.modelo.construtores.ConstrutorDeRoboAleatorio;
import br.ifb.tsi.poo.robo.modelo.construtores.ConstrutorDeRoboInterativo;

public class Principal {
	public static void main(String[] args) {
		var cb = new ConstrutorDeBatalha(new ConstrutorDeRoboInterativo(), new BatalhaEmTurnos());
		cb.construirBatalha();
	}
}
