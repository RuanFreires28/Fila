package model;

public class Cliente 
{

	private int numero;
	private String nome;
	//private boolean prioridade;
	
	public Cliente(int numero, String nome) 
	{
		this.nome = nome;		
		this.numero = numero;
		
	}
	
	
	public Cliente() 
	{
		
	}
	
	public int getNumero() 
	{
		return numero;
	}

	public void setNumero(int numero) 
	{
		this.numero = numero;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

}
