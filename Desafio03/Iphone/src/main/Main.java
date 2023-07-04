package main;

import DispositivoMobile;
import internet.Navegacao;
import internet.NavegadorInternet;
import midia.Reprodutor;
import midia.ReprodutorMusical;
import telefone.Telefonia;
import telefone.TelefoniaMovel;

public class Main {

	public static void main(String[] args) {
	
		DispositivoMobile dp = new DispositivoMobile();
		dp.adicionarNovaAba();
		dp.atender();
		dp.selecionarMusica();
		
		
		Navegacao nv = new NavegadorInternet();
		nv.exibirPagina();
		
		
		TelefoniaMovel tel = new Telefonia();
		tel.iniciarCorrerioVoz();
		
		
		Reprodutor rep = new ReprodutorMusical();
		rep.tocar();

	}

}