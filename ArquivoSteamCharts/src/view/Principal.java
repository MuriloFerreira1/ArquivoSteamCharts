package view;

import java.io.IOException;

import controller.SteamController;

public class Principal {

	public static void main(String[] args) {
		String path = "C:\\Users\\FATEC ZONA LESTE\\Desktop";
		String nome = "teste.csv";
		
		try {
			SteamController.criaArquivo("2021", "February", path, nome);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
