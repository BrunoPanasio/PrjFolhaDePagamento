package model;

public class Empreiteiro extends Funcionario {
	@Override
	public String toString() {
		return "Empreiteiro [valorEmpreita=" + valorEmpreita + "]";
	}

	private float valorEmpreita;

	public Empreiteiro(String nome, int numeroRegistro, float valorEmpreita) {
		super(nome, numeroRegistro);
		this.valorEmpreita = valorEmpreita;
	}

	@Override
	public float calcularSalario() {
		return valorEmpreita;
	}

	public float getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(float valorEmpreita) {
		if( valorEmpreita <= 0) throw new RuntimeException("Valor de empreita não pode ser zero");
		this.valorEmpreita = valorEmpreita;
	}
	
	
	
}
