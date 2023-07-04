package telefone;

public class Telefonia implements TelefoniaMovel{

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

}