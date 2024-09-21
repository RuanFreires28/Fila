package model;


public class Fila <T>
{
	No<T> inicio;
	No<T> fim;
	
	public Fila() 
	{
		inicio = null;
		fim = null;
	}
	
	public boolean isEmpty()
	{
		if (inicio == null && fim == null)
		{
			return true;
		}
		return false;
	}
	
	public void insert(T valor)
	{
		No<T> elemento = new No<>();
		
		elemento.dado = valor;
		elemento.proximo = null;	
	
		if(isEmpty())
		{
			fim = elemento;
			inicio = fim;
		}
		else
		{
			fim.proximo = elemento;
			fim = elemento;
		}	
	}
	
	public T remove() throws Exception
	{
		if (isEmpty())
		{
			throw new Exception("fila vazia");
		}
		
		T valor = inicio.dado;
		
		if (inicio == fim && inicio !=null) // deixa inicio e fim iguais pqn a fila so tem um elemento
		{
			inicio = null;
			fim = inicio;
		}
		else // pra qnd a fil tem + de 1 elemento
		{
			inicio = inicio.proximo;
		}
		return valor;
	}
	
	public int size()
	{
		int cont = 0;
		
		if (!isEmpty())
		{
			No<T> aux = inicio;
			
			while(aux != null)
			{
				cont += 1;
				aux = aux.proximo;
			}
		}
		
		return cont;
	}
	
	public void list()throws Exception
	{
		
		if (isEmpty())
		{
			throw new Exception("Pilha vazia");
		}
		No<T> aux = inicio;
			
		while(aux != null)
		{
			System.out.println(aux.dado);
			aux = aux.proximo;
		}
	
	}
	
}
