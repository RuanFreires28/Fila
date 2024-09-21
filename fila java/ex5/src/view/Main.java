package view;

import javax.swing.JOptionPane;

import br.gov.sp.FilaGenerica.Fila;
import controller.Controller;
import model.Cliente;

public class Main
{

	public static void main(String[] args) 
	{
	
		Controller c = new Controller();
		
		Fila<Cliente> filaNormal = new Fila<>();
		Fila<Cliente> filaPrioritaria = new Fila<>();
		
		Cliente cliente = new Cliente();
		
		int op = 0;
		
		while(op != 9)
		{
			op = Integer.parseInt(JOptionPane.showInputDialog("Ultimo cliente registrado: " + cliente.getNome() 
					+ "\nDigite a operação desejada:\n"
					+ "1 - inserir Cliente\n"
					+ "2 - inserir Cliente na fila prioritaria\n"
					+ "3 - inserir Cliente na fila normal\n"
					+ "4 - remover Cliente da fila Prioritaria\n"
					+ "5 - remover Cliente da fila normal\n"
					+ "6 - chamar proximo Cliente\n"
					+ "9 - sair"));
			
			switch (op)
			{
				case 1: 
					cliente.setNome(JOptionPane.showInputDialog("digite o nome do cliente: "));
					cliente.setNumero(cliente.getNumero() + 1);
					break;
				
				case 2:
					c.Inserir(filaPrioritaria, cliente);
					break;
				
				case 3:
					c.Inserir(filaNormal, cliente);
					break;
				
				case 4:
					c.Remover(filaPrioritaria);
					break;
					
				case 5:
					c.Remover(filaNormal);
					break;
					
				case 6:
					c.ChamaCliente(filaNormal, filaPrioritaria);
					break;
					
				case 9:
					break;
				default:
					System.out.println("valor invalido");
					break;
			}
			
		}
	}
	
}
