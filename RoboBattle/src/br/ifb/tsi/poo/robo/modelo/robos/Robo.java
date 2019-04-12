package br.ifb.tsi.poo.robo.modelo.robos;

import java.util.Random;

public class Robo implements Lutador{
	private int saude;
	private String nome;
	
	private Peca cabeca;
	private Peca tronco;
	private Peca bracoEsquerdo;
	private Peca bracoDireito;
	private Peca pernas;
	
	
	public Robo() {
		super();
		
		this.nome = "Null";
		this.saude = 10;
		this.cabeca = new Peca(0,0,0,0);
		this.tronco = new Peca(0,0,0,0);
		this.pernas = new Peca(0,0,0,0);
		this.bracoDireito = new Peca(0,0,0,0);
		this.bracoEsquerdo = new Peca(0,0,0,0);
	}

	public Robo(String nome, Peca cabeca, Peca tronco, Peca bracoEsquerdo, Peca bracoDireito, Peca pernas) {
		super();
		this.nome = nome;
		this.saude = 100;
		this.cabeca = cabeca;
		this.tronco = tronco;
		this.bracoEsquerdo = bracoEsquerdo;
		this.bracoDireito = bracoDireito;
		this.pernas = pernas;
	}

	@Override
	public void atacar(Lutador alvo) {
		int dano = 0;
		dano += bracoDireito.getAtaque();
		dano += bracoEsquerdo.getAtaque();
		dano += pernas.getAtaque();
		dano += tronco.getAtaque();
		dano += cabeca.getAtaque();
		alvo.defender(dano);
	}

	@Override
	public void defender(int dano) {
		int defesa = 0, danoSofrido = 0;
		defesa += bracoDireito.getDefesa();
		defesa += bracoEsquerdo.getDefesa();
		defesa += tronco.getDefesa();
		defesa += cabeca.getDefesa();
		defesa += pernas.getDefesa();
		if(dano > defesa) {
			danoSofrido = dano - defesa;
			if(this.saude > danoSofrido) {
				this.saude -= danoSofrido;
			}else {
				this.saude = 0;
			}			
		}
		this.reduzDurabilidade(danoSofrido);
	}
	
	private void reduzDurabilidade(int dano) {
		Random rand = new Random();
		int sorteio = rand.nextInt(10) + dano;
		if(sorteio > 5) {
			switch (rand.nextInt(5)) {
			case 0:
				this.getCabeca().reduzDurabilidade();
				break;
			case 1:
				this.getTronco().reduzDurabilidade();
				break;
			case 2:
				this.getPernas().reduzDurabilidade();
				break;
			case 3:
				this.getBracoDireito().reduzDurabilidade();
				break;
			case 4:
				this.getBracoEsquerdo().reduzDurabilidade();
				break;
			default:
				break;
			}
		}
	}
	
	public boolean estaVivo() {
		boolean funcionando = this.bracoDireito.funciona() ||this.bracoEsquerdo.funciona() ||this.cabeca.funciona() ||this.tronco.funciona() || this.pernas.funciona();
		return (saude > 0 && funcionando);
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSaude() {
		return saude;
	}

	public void setSaude(int saude) {
		this.saude = saude;
	}

	public Peca getCabeca() {
		return cabeca;
	}

	public void setCabeca(Peca cabeca) {
		this.cabeca = cabeca;
	}

	public Peca getTronco() {
		return tronco;
	}

	public void setTronco(Peca tronco) {
		this.tronco = tronco;
	}

	public Peca getBracoEsquerdo() {
		return bracoEsquerdo;
	}

	public void setBracoEsquerdo(Peca bracoEsquerdo) {
		this.bracoEsquerdo = bracoEsquerdo;
	}

	public Peca getBracoDireito() {
		return bracoDireito;
	}

	public void setBracoDireito(Peca bracoDireito) {
		this.bracoDireito = bracoDireito;
	}

	public Peca getPernas() {
		return pernas;
	}

	public void setPernas(Peca pernas) {
		this.pernas = pernas;
	}

	@Override
	public String toString() {
		String pecas = "";
		if(this.getCabeca().funciona()) { pecas +="[C]";} else { pecas +="[X]";}
		if(this.getTronco().funciona()) { pecas +="[T]";} else { pecas +="[X]";}
		if(this.getPernas().funciona()) { pecas +="[P]";} else { pecas +="[X]";}
		if(this.getBracoEsquerdo().funciona()) { pecas +="[BE]";} else { pecas +="[X]";}
		if(this.getBracoDireito().funciona()) { pecas +="[BD]";} else { pecas +="[X]";}
		return "Robo [nome= " + nome +", saude=" + saude + "]"+pecas; 
	}
	
	
	
	
}
