package ui;
import java.util.ArrayList;

import model.*;
public class folhaDePagamento {
	public static void main(String[] args) {
		ArrayList<Funcionario> lista;
		lista = new ArrayList<Funcionario>();
		
		try { 
		lista.add(new Chefe("Wu", 1, 5000, 10, 800));
		} catch(RuntimeException e) {System.out.println(e);}
		try {
			lista.add(new Comissionado("Washington", 2, 2000, 1000));	
		} catch(RuntimeException e) {System.out.println(e);}
		try {
			lista.add(new Empreiteiro("Lu", 3, 15000));
		} catch(RuntimeException e) {System.out.println(e);}
		try {
		lista.add(new Horista("Jô", 1, 500, 59));
		} catch(RuntimeException e) {System.out.println(e);}
		
		try {
		for (Funcionario f : lista) {
			System.out.print(f.toString());
			System.out.printf("R$%.2f\n",f.calcularSalario());
		}
		}catch (RuntimeException e) {System.out.println("Algo errado não deu certo.");}
		
		
		
	}
}