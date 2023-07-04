import internet.Navegacao;
import midia.Reprodutor;
import telefone.TelefoniaMovel;




public class DispositivoMobile  implements Navegacao, Reprodutor, TelefoniaMovel{

	@Override
	public void ligar() {
		System.out.println("Ligando.");
		
	}

	@Override
	public void atender() {
		System.out.println("Chamada atendida.");
		
	}

	@Override
	public void iniciarCorrerioVoz() {
		System.out.println("Correio iniciado");
		
	}

	@Override
	public void cancelarChamada() {
		System.out.println("Chamada cancelada");
		
	}

	@Override
	public void tocar() {
		System.out.println("Musica iniciada");
		
	}

	@Override
	public void pausar() {
		System.out.println("Musica em pausa");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando na lista");
		
	}

	@Override
	public void avancar() {
		System.out.println("Avançar musica");
		
	}

	@Override
	public void retroceder() {
		System.out.println("Retroceder musica");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Pagina aberta");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova guia aberta");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atualizada");
		
	}

	@Override
	public void avancarPagina() {
		System.out.println("Pagina avançada");
		
	}

	@Override
	public void retrocederPagina() {
		System.out.println("Pagina anterior");
		
	}



}