public class ParametrosInvalidosException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "O Primeiro parâmetro e maior que o segundo parâmetro.";
		
	}

}