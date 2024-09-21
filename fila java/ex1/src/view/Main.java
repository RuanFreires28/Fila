package view;

import model.Fila;
import controller.Controller;

public class Main 
{

	public static void main(String[] args) 
	{
		Controller c = new Controller();
		Fila<Integer> fila = new Fila<>();

		int[] vet = {18, 39, 12, 73, 90, 61};
		int vetmax = vet.length;
		
		
		for (int i = 0; i < (vetmax); i++)
		{
			fila.insert(vet[i]);
		}
		
		
		
		System.out.println("A fila atualmente é: ");
		try {
			fila.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		fila = c.InverteFila(fila);
		
		
		System.out.println("A fila invertida é: ");
		try {
			fila.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
