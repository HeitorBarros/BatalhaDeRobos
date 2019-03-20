package br.ifb.tsi.poo.robo.modelo.robos;

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
		this.cabeca = new Peca(0,0,0);
		this.tronco = new Peca(0,0,0);
		this.pernas = new Peca(0,0,0);
		this.bracoDireito = new Peca(0,0,0);
		this.bracoEsquerdo = new Peca(0,0,0);
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
		int defesa = 0;
		defesa += bracoDireito.getDefesa();
		defesa += bracoEsquerdo.getDefesa();
		defesa += tronco.getDefesa();
		defesa += cabeca.getDefesa();
		defesa += pernas.getDefesa();
		if(dano > defesa) {
			int danoSofrido = dano - defesa;
			this.saude -= danoSofrido;
		}
	}
	
	public boolean estaVivo() {
		return (saude > 0);
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Robo [nome= " + nome +", saude=" + saude + "]";
	}
	
	
}
