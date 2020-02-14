package br.com.cliente;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import fiap.servico.loja.App.Store.LojaService;
import fiap.servico.loja.App.Store.LojaServiceServiceLocator;

public class ClienteWeb {

	public static void main(String[] args) {
	
		try {
			LojaService ls = new LojaServiceServiceLocator().getlojaService();
			System.out.println("MENSAGEM WEB SERVICE : " + ls.consultaCod(401));
		}catch (ServiceException e) {
			e.printStackTrace();
		}catch (RemoteException e) {
			e.printStackTrace();
		}
	}
		
}
