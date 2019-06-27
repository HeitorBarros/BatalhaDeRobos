package br.ifb.tsi.poo.robo.modelo.batalhas;

import java.util.Scanner;
import br.ifb.tsi.poo.robo.modelo.habilidades.Habilidade;
import br.ifb.tsi.poo.robo.modelo.robos.Lutador;
import br.ifb.tsi.poo.robo.modelo.robos.LutadorComHabilidade;
import br.ifb.tsi.poo.robo.modelo.robos.Robo;
import br.ifb.tsi.poo.robo.modelo.robos.RoboComHabilidade;

public class BatalhaComHabilidades extends Batalha{
	Scanner teclado;
	public BatalhaComHabilidades() {
		super();
		teclado = new Scanner(System.in);
	}

	public BatalhaComHabilidades(Lutador r1, Lutador r2) {
		super(r1, r2);
		teclado = new Scanner(System.in);
	}
	
	@Override
	public void iniciar() {
		int turno = 0;
		int optH1 = 0, optH2 = 0;
		while(r1.estaVivo() && r2.estaVivo()) {
			((LutadorComHabilidade)r1).desabilitarModoDefesa();
			((LutadorComHabilidade)r2).desabilitarModoDefesa();
			
			System.out.println("Turno "+ turno++);
			System.out.println(r1);
			System.out.println(r2);
			
			int optr1 = this.escolherAtaque(r1, r2);
			if(optr1 == 3) {
				optH1 = this.escolherHabilidade(r1);
			}
			int optr2 = this.escolherAtaque(r2, r1);
			if(optr2 == 3) {
				optH2 = this.escolherHabilidade(r2);
			}
			
			if(optr1 == 2) {
				((LutadorComHabilidade)r1).habilitarModoDefesa();
			}
			if(optr2 == 2) {
				((LutadorComHabilidade)r2).habilitarModoDefesa();
			}
			
			if (optr1 == 1) {
				r1.atacar(r2);
			}else if(optr1 == 3 && r1 instanceof RoboComHabilidade) {
				this.usarHabilidade(r1, r2, optH1);
			}else if(optr1 != 2){
				System.out.println("Opção Inválida.");
			}
			
			if (optr2 == 1) {
				r2.atacar(r1);
			}else if(optr2 == 3 && r2 instanceof RoboComHabilidade) {
				this.usarHabilidade(r2, r1, optH2);
			}else if(optr2 != 2){
				System.out.println("Opção Inválida.");
			}
			
			
			((RoboComHabilidade) r1).recuperarEnergia();
			((RoboComHabilidade) r2).recuperarEnergia();
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(r1.estaVivo()) {
			System.out.println("VENCEDOR:\n"+r1);
		}else if(r2.estaVivo()) {
			System.out.println("VENCEDOR:\n"+r2);
		} else {
			System.out.println("EMPATE!");
		}
	}
	
	private int escolherHabilidade(Lutador r1) {
		System.out.println("Escolha a Habilidade:");
		int i = 1;
		RoboComHabilidade r1h = (RoboComHabilidade) r1;
		for (Habilidade h : r1h.getHabilidades()) {
			System.out.println(i++ +"-"+ h);
		}
		
		return teclado.nextInt();
		
	}

	private int escolherAtaque(Lutador r1, Lutador r2) {
		System.out.println(r1.getNome());
		System.out.println("Escolha o ataque:");
		System.out.println("1 - ataque normal");
		System.out.println("2 - defender");
		if(r1 instanceof RoboComHabilidade & ((RoboComHabilidade)r1).getHabilidades().size() > 0) {
			System.out.println("3 - habilidade");
		}
		int opt = teclado.nextInt();
		return opt;
		
		
	}
	private void usarHabilidade(Lutador r1, Lutador r2, int opt) {
		RoboComHabilidade r1h = (RoboComHabilidade) r1;
		if(r1h.getHabilidades().size() >= opt & opt > 0) {
			r1h.aplicar(r1h.getHabilidades().get(opt-1), r2);
		}else {
			System.out.println("Habilidade escolhida não disponível.");
		}
		
		
	}

}
