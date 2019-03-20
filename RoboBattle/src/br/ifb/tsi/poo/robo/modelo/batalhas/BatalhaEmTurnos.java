package br.ifb.tsi.poo.robo.modelo.batalhas;


import br.ifb.tsi.poo.robo.modelo.robos.Robo;

public class BatalhaEmTurnos extends Batalha{
	
	public BatalhaEmTurnos() {
		super();
	}

	public BatalhaEmTurnos(Robo r1, Robo r2) {
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
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(r1.estaVivo()) {
			System.out.println(r1.getNome()+" foi o vencedor!");
		}else if(r2.estaVivo()) {
			System.out.println(r2.getNome()+" foi o vencedor!");
		} else {
			System.out.println("EMPATE!");
		}
	}

}
