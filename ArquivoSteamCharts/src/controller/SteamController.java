package controller;

import java.io.*;

public class SteamController {
	private static File Steam = new File("C:\\TEMP","SteamCharts.csv");
	
	public static void pesquisaArquivo(String ano, String mes, Double media) throws IOException {
		FileInputStream fluxo = new FileInputStream(Steam);
		InputStreamReader reader = new InputStreamReader(fluxo);
		BufferedReader buffer = new BufferedReader(reader);
		String linha = buffer.readLine();
	}
	
	public static void criaArquivo(String ano, String mes, String path, String nome) throws IOException {
		File dir = new File(path);
		if(dir.exists()&& dir.isDirectory()) {
			File arquivoNovo = new File(dir,nome);
			FileInputStream fluxo = new FileInputStream(Steam);
			InputStreamReader reader = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(reader);
			String linha = buffer.readLine();
			FileWriter writer = new FileWriter(arquivoNovo);
			while(linha!=null) {
				String[] elementos=linha.split(",");
				if(ano.equals(elementos[1])&&mes.equals(elementos[2])) {
					writer.append(elementos[0]+" ; "+ elementos[3]+"\n");
				}
				linha=buffer.readLine();
			}
			writer.close();
			buffer.close();
			reader.close();
			fluxo.close();
		}else { throw new IOException("Diretório Inexistente");}
	}
}
