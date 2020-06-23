package model;

public class Chefe extends Funcionario {
	private float salarioBase, adicionalFuncao, beneficioTerno;

	public Chefe(String nome, int numeroRegistro, float salarioBase, float adicionalFuncao, float beneficioTerno) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}

	@Override
	public String toString() {
		return "Chefe [salarioBase=" + salarioBase + ", adicionalFuncao=" + adicionalFuncao + ", beneficioTerno="
				+ beneficioTerno + ", nome=" + nome + ", numeroRegistro=" + numeroRegistro + ", calcularSalario()="
				+ calcularSalario() + "]";
	}

	@Override
	public float calcularSalario() {
		return salarioBase + salarioBase*adicionalFuncao/100 + beneficioTerno;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		if( salarioBase <= 0) throw new RuntimeException("Salario base não pode ser zero");
		this.salarioBase = salarioBase;
	}

	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}

	public void setAdicionalFuncao(float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}

	public float getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(float beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}
	
	
	
}
