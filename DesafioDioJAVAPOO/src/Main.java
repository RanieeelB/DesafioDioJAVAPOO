import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("iPhone X", "iOS");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a função que deseja iniciar:");
        System.out.println("1. Reprodutor Musical");
        System.out.println("2. Aparelho Telefônico");
        System.out.println("3. Navegador na Internet");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                iphone.usarReprodutorMusical(new ReprodutorMusical() {
                    public void tocar() {
                        System.out.println("Tocando música no iPhone");

                    }

                    public void pausar() {
                        System.out.println("Pausando música no iPhone");
                    }

                    public void selecionarMusica(String musica) {
                        System.out.println("Selecionando música no iPhone: " + musica);
                    }
                });
                break;
            case 2:
                iphone.usarAparelhoTelefonico(new AparelhoTelefonico() {
                    public void ligar(String numero) {
                        System.out.println("Fazendo chamada do iPhone para o número: " + numero);
                    }

                    public void atender() {
                        System.out.println("Atendendo chamada no iPhone");
                    }

                    public void iniciarCorreioVoz() {
                        System.out.println("Iniciando correio de voz no iPhone");
                    }
                });
                break;
            case 3:
                iphone.usarNavegadorInternet(new NavegadorInternet() {
                    public void exibirPagina(String url) {
                        System.out.println("Exibindo página no navegador do iPhone: " + url);
                    }

                    public void adicionarNovaAba() {
                        System.out.println("Adicionando nova aba no navegador do iPhone");
                    }

                    public void atualizarPagina() {
                        System.out.println("Atualizando página no navegador do iPhone");
                    }
                });
                break;
            default:
                System.out.println("Escolha inválida");
        }

        scanner.close();
    }
}
