package controller;

import br.gov.sp.FilaGenerica.Fila;
import model.Cliente;

public class Controller 
{

	private static int cont = 0;
	
	public Controller() 
	{
		super();
	}
	
	public void Inserir(Fila<Cliente> fila, Cliente cliente)
	{
		fila.insert(cliente);
		//return fila;		
	}
	
	public void Remover(Fila<Cliente> fila)
	{
		try 
		{
			fila.remove();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return fila;		
	}
	
	public void ChamaCliente(Fila<Cliente> filaNormal, Fila<Cliente> filaPrioritaria) 
	{
		
		Cliente clientechamado = new Cliente();
		
		if (!filaPrioritaria.isEmpty() || cont < 3)
		{
			cont++;
			
			try 
				{
					clientechamado = filaPrioritaria.remove();
				}	 
			catch (Exception e) 
				{
					e.printStackTrace();
				}
		}
		else
		{
			cont = 0;
			try 
			{
				clientechamado = filaNormal.remove();
			}	 
		catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("chamando: " + clientechamado.getNome());
	}
	
	
}
