package internet;

public class NavegadorInternet  implements Navegacao{

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