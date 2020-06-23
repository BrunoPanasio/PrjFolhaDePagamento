package model;

public abstract class Funcionario {
	protected String nome;
	protected int numeroRegistro;
	public Funcionario(String nome, int numeroRegistro) {
		super();
		if (nome.length()<2) {
			throw new RuntimeException("Nome deve conter pelo menos 2 caracteres.");
		}
		if (numeroRegistro <= 0) {
			throw new RuntimeException("id deve ser maior que 0.");
		}
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;	
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", numeroRegistro=" + numeroRegistro + "]";
	}

	//toda descendencia de funcionario deve ter implementado calculaSalario
	public abstract float calcularSalario();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length()==0) { throw new RuntimeException("Obrigatorio preenchimento");}
		this.nome = nome;
	}
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int numeroRegistro) {
		if (numeroRegistro<=0) { throw new RuntimeException("Id de registro não pode ser zero ou menor");}
		this.numeroRegistro = numeroRegistro;
	}
	
	
}
