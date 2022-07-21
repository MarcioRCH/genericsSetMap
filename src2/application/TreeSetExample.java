package application;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import entities.ProductTreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Set <ProductTreeSet> set = new TreeSet<>();
		
		set.add(new ProductTreeSet("TV", 900.00));
		set.add(new ProductTreeSet("Notebook", 1200.00));
		set.add(new ProductTreeSet("Tablet", 400.00));
		
		for(ProductTreeSet p : set) {
			System.out.println(p);
		}

	}

}