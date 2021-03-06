package br.ifb.tsi.poo.robo.modelo.batalhas;


import br.ifb.tsi.poo.robo.modelo.robos.Lutador;
import br.ifb.tsi.poo.robo.modelo.robos.Robo;

public class BatalhaEmTurnos extends Batalha{
	
	public BatalhaEmTurnos() {
		super();
	}

	public BatalhaEmTurnos(Lutador r1, Lutador r2) {
		super(r1, r2);
	}

	@Override
	public void iniciar() {
		int turno = 0;
		while(r1.estaVivo() && r2.estaVivo()) {
			r1.atacar(r2);
			r2.atacar(r1);
			System.out.println("Turno "+ ++turno);
			System.out.println(r1);
			System.out.println(r2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(r1.estaVivo()) {
			System.out.println(r1+" foi o vencedor!");
		}else if(r2.estaVivo()) {
			System.out.println(r2+" foi o vencedor!");
		} else {
			System.out.println("EMPATE!");
		}
	}

}
