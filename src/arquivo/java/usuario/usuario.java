

package arquivo.java.usuario;

import arquivo.java.aparelho.Aparelho;
import arquivo.java.aparelho.AparelhoTelefone;
import arquivo.java.navegador.Navegador;
import arquivo.java.navegador.NavegadorInternet;
import arquivo.java.reprodutor.Reprodutor;
import arquivo.java.reprodutor.ReprodutorMusical;

/* DesafioPOO Modelagem e diagramação da representação em UML
 * da sua preferência a diagramação das classes e interfaces com a proposta 
 * de representar os papeis do iphone de : REPRODUTO MUSICAL, APARELHO TELEFONICO
 * NAVAGADOR DE INTERNET */
public class usuario {
	public static void main(String[] args) {
		ReprodutorMusical reprodutorMusical = new Reprodutor();
		reprodutorMusical.selecionarMusica();
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();
	
	NavegadorInternet navegadorInternet = new SmartPhone();
	navegadorInternet.abrirNovaPagina();
	navegadorInternet.atualizaPagina();
	navegadorInternet.abrirNovaPagina();
	
	AparelhoTelefone aparelhoTelefone = new Aparelho();
	aparelhoTelefone.ligar();
	aparelhoTelefone.atender();
	aparelhoTelefone.correioDeVoz();
		
		
		
	}
}