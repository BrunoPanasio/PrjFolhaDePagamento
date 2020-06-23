package model;

public class Comissionado extends Funcionario {
	@Override
	public String toString() {
		return "Comissionado [salarioBase=" + salarioBase + ", comissao=" + comissao + "]";
	}

	private float salarioBase, comissao;

	public Comissionado(String nome, int numeroRegistro, float salarioBase, float comissao) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	
	
	@Override
	public float calcularSalario() {
		return salarioBase+comissao;
	}



	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		if( salarioBase <= 0) throw new RuntimeException("Salario base não pode ser zero");
		this.salarioBase = salarioBase;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	

}
