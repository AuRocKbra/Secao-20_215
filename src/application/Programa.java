package application;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {
		List<Produto> list = new ArrayList<>();
		list.add(new Produto("TV",900.00));
		list.add(new Produto("Mouse",50.00));
		list.add(new Produto("Tablet",350.50));
		list.add(new Produto("HD case", 80.90));
		
		//Predicate<Produto> pred = p -> p.getPreco() >= 100.00;Declaração de função lambda
		
		list.removeIf(p ->p.getPreco() >=100);
		
		for(Produto p : list) {
			System.out.println(p);
		}
	}

}
