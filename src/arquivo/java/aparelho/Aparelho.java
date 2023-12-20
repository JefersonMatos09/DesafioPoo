package arquivo.java.aparelho;

public class Aparelho implements AparelhoTelefone {
	public void ligar() {
		System.out.println("LIGANDO");
	}
	public void atender() {
		System.out.println("ATENDENDO");
	}
	public void correioDeVoz() {
        System.out.println("CORREIO DE VOZ");
	}
}
