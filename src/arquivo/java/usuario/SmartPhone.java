package arquivo.java.usuario;

import arquivo.java.aparelho.AparelhoTelefone;
import arquivo.java.navegador.NavegadorInternet;
import arquivo.java.reprodutor.ReprodutorMusical;

public class SmartPhone implements ReprodutorMusical,NavegadorInternet,AparelhoTelefone
{
		 public void selecionarMusica() {
			 System.out.println("USÚARIO SELECIONANDO MÚSICA");
		 }
		 public void tocar() {
			 System.out.println("TOCANDO MÚSICA");
		 }
		 public void pausar() {
		     System.out.println("MÚSICA PAUSADA");
		}
		 public void exibirPagina() {
				System.out.println("USÚARIO ACESSANDO INTERNET");
				}
			public void atualizaPagina() {
			System.out.println("USÚARIO ATUALIZANDO PÁGINA DE INTERNET");
			    }
		    public void abrirNovaPagina() {
			System.out.println("ABRINDO NOVA PÁGINA DE INTERNET");
			    }
			public void ligar() {
				System.out.println("USÚARIO REALIZANDO LIGAÇÃO");
			}
			public void atender() {
				System.out.println("USÚARIO ATENDENDO LIGAÇÃO");
			}
			public void correioDeVoz() {
		        System.out.println("ABRINDO CORREIO DE VOZ");
			}

	}

