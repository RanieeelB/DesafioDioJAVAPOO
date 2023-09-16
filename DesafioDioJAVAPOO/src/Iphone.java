import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class Iphone {
    private String modelo;
    private String sistemaOperacional;

    public Iphone(String modelo, String sistemaOperacional) {
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void ligar() {
        System.out.println("Ligando iPhone");
    }

    public void desligar() {
        System.out.println("Desligando iPhone");
    }

    public void conectarInternet() {
        System.out.println("Conectando à internet no iPhone");
    }

    public void usarReprodutorMusical(ReprodutorMusical reprodutor) {
        System.out.println("Iniciando Reprodutor Musical no iPhone");
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica("Música 1");
    }

    public void usarAparelhoTelefonico(AparelhoTelefonico telefone) {
        System.out.println("Iniciando Aparelho Telefônico no iPhone");
        telefone.ligar("(85) 9 9860-3946");
        telefone.atender();
        telefone.iniciarCorreioVoz();
    }

    public void usarNavegadorInternet(NavegadorInternet navegador) {
        System.out.println("Iniciando Navegador na Internet no iPhone");
        navegador.exibirPagina("https://web.dio.me/home");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
