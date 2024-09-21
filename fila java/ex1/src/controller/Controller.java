package controller;

import br.edu.fateczl.pilhagenerica.Pilha;
import model.Fila;

public class Controller 
{

	
	
	public Controller() 
	{
		super();
	}
	
	
	public <T> Fila<T> InverteFila(Fila<T> fila)
	{
		
		Pilha<T> pilha = new Pilha<>();		
		
		
		while (!fila.isEmpty())
		{	
			try {
				pilha.push(fila.remove());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		while (!pilha.isEmpty())
		{
			try {
				fila.insert(pilha.pop());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return fila;
	}
	
	
	
	
}
