package co.edu.unbosque.model;

public class SuperAstroDTO {

	private int numCifras = 4;
	private String signoZodiacal;
	
	public SuperAstroDTO() {
		
	}
	
	public SuperAstroDTO(int numCifras, String signoZodiacal) {
		this.numCifras = numCifras;
		this.signoZodiacal = signoZodiacal;
	}

	public int getNumCifras() {
		return numCifras;
	}

	public void setNumCifras(int numCifras) {
		this.numCifras = numCifras;
	}

	public String getSignoZodiacal() {
		return signoZodiacal;
	}

	public void setSignoZodiacal(String signoZodiacal) {
		this.signoZodiacal = signoZodiacal;
	}
	
	
}
