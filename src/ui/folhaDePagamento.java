package ui;
import java.util.ArrayList;
import model.*;
public class folhaDePagamento {
	public static void main(String[] args) {
		ArrayList<Funcionario> lista;
		lista = new ArrayList<Funcionario>();
		lista.add(new Chefe("Mario", 1, 5000, 10, 800));
		lista.add(new Comissionado("Washington", 2, 2000, 1000));
		lista.add(new Empreiteiro("Luiz", 3, 15000));
		lista.add(new Horista("José", 4, 500, 59));
		for (Funcionario f : lista) {
			System.out.printf("R$%.2f\n",f.calcularSalario());
		}
	}
}