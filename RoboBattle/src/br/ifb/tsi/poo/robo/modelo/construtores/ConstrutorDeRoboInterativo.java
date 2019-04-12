package br.ifb.tsi.poo.robo.modelo.construtores;

import java.util.Scanner;

import br.ifb.tsi.poo.robo.modelo.robos.Lutador;
import br.ifb.tsi.poo.robo.modelo.robos.Peca;
import br.ifb.tsi.poo.robo.modelo.robos.Robo;

public class ConstrutorDeRoboInterativo extends ConstrutorDeLutador {
	private Scanner teclado;

	public ConstrutorDeRoboInterativo() {
		super();
		this.teclado = new Scanner(System.in);
	}

	@Override
	public Lutador construirLutador() {
		Robo r = new Robo();
		r.setSaude(100);
		System.out.println("Digite o nome do Robô:");
		r.setNome(teclado.nextLine());
		r.setCabeca(escolhaPeca("Cabeça"));
		r.setTronco(escolhaPeca("Tronco"));
		r.setPernas(escolhaPeca("Pernas"));
		r.setBracoDireito(escolhaPeca("Braço Direito"));
		r.setBracoEsquerdo(escolhaPeca("Braço Esquerdo"));
		
		return r;
	}
	
	private Peca escolhaPeca(String nomePeca) {
		Peca p1 = ConstrutorDePeca.construirPeca();
		Peca p2 = ConstrutorDePeca.construirPeca();
		Peca p3 = ConstrutorDePeca.construirPeca();
		
		System.out.println("Escolha o "+nomePeca);
		System.out.println("1 - "+p1);
		System.out.println("2 - "+p2);
		System.out.println("3 - "+p1);
		String opt = teclado.nextLine();
		switch(opt) {
		case "1": return p1; 
		case "2": return p2; 
		case "3": return p3; 
		}
		return p1;
	}

	
	
}
