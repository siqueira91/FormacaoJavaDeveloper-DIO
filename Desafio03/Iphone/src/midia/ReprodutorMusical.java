package midia;

public class ReprodutorMusical implements Reprodutor{

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

}
