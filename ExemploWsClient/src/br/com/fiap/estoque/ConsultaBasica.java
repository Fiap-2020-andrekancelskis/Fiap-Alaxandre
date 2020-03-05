package br.com.fiap.estoque;

import java.rmi.RemoteException;
import java.util.Scanner;

import org.apache.axis2.AxisFault;

import br.com.fiap.estoque.EstoqueBasicoStub.Soma;
import br.com.fiap.estoque.EstoqueBasicoStub.SomaResponse;

public class ConsultaBasica {

	
		 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um numero: ");
			int n1 = sc.nextInt();
			System.out.println("Digite um segundo numero: ");
			int n2 = sc.nextInt();
				
			
			 try {
				 
				 //Classe stub.
				 EstoqueBasicoStub ebs = new EstoqueBasicoStub();
				 
				 //classe com nome do metodo.
				 Soma sm = new Soma();
				 sm.setNr1(n1);
				 sm.setNr2(n2);
				 
				 //stub recebendo o paramentro ja retornando para a response.
				 SomaResponse smr =	 ebs.soma(sm);
				 
				 //response retornando o OBJ resultando.
				 System.out.println("O resultado da operação é: " + smr.get_return());
				
			} catch (AxisFault e) {
				e.printStackTrace();
			}catch (RemoteException e) {
				e.printStackTrace();
			}
			 
		}
}
